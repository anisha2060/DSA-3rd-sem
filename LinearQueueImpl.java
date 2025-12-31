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
}