import java.util.Scanner;
public class CircularQueue {
    static int N=10;//Maximum size or a queue
    static int [] queue=new int[N];
    static int F=-1;
    static int R=-1;
    public static boolean isFull(){
        if(F==(R+1)%N){
            return true;
        }else{
            return false;     
        }
    }

    public static boolean isEmpty(){
        if(F==-1){
            return true;
        }else{
            return false;
        }
    }

    //ENQUEUE OPERATION
    public static void enqueue(int ITEM){
        if (isFull()){
            System.out.println("Overflow:Queue isFull");
            return;
        }

        if(F==-1){
            F=0;
            R=0;
        }else{
            R=(R+1)%N;
        }

        queue[R]=ITEM;
        System.out.println(ITEM+"is inserted sucessfully");
    }
    //DEQUEUE OPERATION

    public static void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow:Queue isEmpty");
            return;
        }

        int ITEM=queue[F];

        if(F==R){
            F=-1;
            R=-1;
        }else{
            F=(F+1)%N;
        }

        System.out.println(ITEM+"Deleted from queue");
    }

    //Display Operation
    public static void display(){
        if(isEmpty()){
            System.out.println("Queue isEmpty");
            return;
        }

        System.out.println("Queue elements:");
        int i=F;
        while(true){
            System.out.print(queue[i]+"");
            if(i==R)break;
            i = (i + 1) % N;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("=======QUEUE MENU======");
            System.out.println("1. Is Queue Empty");
            System.out.println("2. Is Queue Full");
            System.out.println("3. ENQUEUE (Insert");
            System.out.println("4. DEQUEUE (Delete)");
            System.out.println("5. Display Elements");

            int choice=sc.nextInt();
            int element;


            switch ((choice)) {
                case 1:
                    System.out.println("Queue is Empty?"+isEmpty());
                    break;

                case 2:
                    System.out.println("Queue is Full?"+isFull());
                    break;
                case 3:
                    System.out.println("Enter the element to insert:");
                    element=sc.nextInt();
                    enqueue(element);
                    break;
                case 4:
                    dequeue();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println("Exiting......");
                    System.exit(0);
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice.Try again");
                    break;
            }
        }
    }
}
