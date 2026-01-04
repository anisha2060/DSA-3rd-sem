import java.util.Scanner;
public class LinearQueueImpl{
    static int N = 10;    //maximum size of a queue
    static int [] queue =new int [N] ;
    static int F = -1;
    static int R = -1;

    // Method to check if the queue is FULL

    public static boolean isFull(){
        if (R==N-1){
            return true;
        } else{
            return false;
        }
    }

    // Method to check the queue is EMPTY

    public static boolean isEmpty(){
        if (F==-1 || F>R){
            return true;
        }else{
            return false;
        }
    }

    /*
    ENQUEU OPERATION
    Logic: if(isFull()) write overflow
    */

    public static void enqueue(int ITEM){
        // CHECK IF THE QUEUE IS FULL
        if (isFull()){
            System.out.println("overflow: Queue is full");
            return;
        }
        // CHECK IF IT IS THE FIRST ELEMENT
        if (F== -1){
            F=0;
            R=0;
        } else {
            // INCREMENT REAR
            R=R+1;
        }
        queue[R] =ITEM;
        System.out.println(ITEM+"is inserted sucessfully");
    }

    /*
    DEQUEUE OPERATION
    */

    public static void dequeue(){
        // CHECK IF THE QUEUE IS UNDERFLOW
        if(isEmpty()){
            System.out.println("UNDERflow: Queue is Empty");
            return;
        }
        int ITEM=queue[F];
        // RESET POINTERS IF THE LAST ELEMENT IS REMOVED
        if (F==R){
            F=-1;
            R=-1;
        }else{
            F=F+1;
        }
        System.out.println(ITEM + "is removed from queue");
    }

    public static void Display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i=F;i<=R;i++){
            System.out.println(queue[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args){
        // CREATE MENU FOR ENQUEUE
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("========STACK MENU========");
            System.out.println("1. Is stack empty ?");
            System.out.println("2. Is stack full ?");
            System.out.println("3. ENQUEUE (insert)");
            System.out.println("4. DEQUEUE (delete)");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            int element;
            switch (choice){
                case 1:
                    System.out.println("Queue is Empty" + isEmpty());
                    break;

                case 2:
                    System.out.println("Queue is full" + isFull());
                    break;

                case 3:
                    System.out.println("Enter the element to insert:");
                    element = sc.nextInt();
                    enqueue(element);
                    break;

                case 4:
                    dequeue();
                    break;    

                case 5:
                    Display();
                    break; 

                case 6:
                    System.out.println("Exiting.....");
                    System.exit(0);
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}