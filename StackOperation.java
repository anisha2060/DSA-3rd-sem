import java.util.Scanner;

public class StackOperation {
    static final int MAX = 100;    //Maximum size of the stack
    static int[] stack = new int[MAX];
    static int top = -1;

// check if the stack is empty
    static boolean isEmpty(){
        return top < 0;
    }

    // check if the stack is full

    static boolean isFull(){
        return top >= MAX - 1;
    }
// check the size of the stack
    static int stackSize(){
        return top + 1;
    }


// PUSH OPERATION
    static void push(int element){
        if(isFull()){
            System.out.println("Stack overflow!! Cannot push the element");
            return;
        }

        stack[++top]= element;
        System.out.println("The pushed element in the stack is:" + element);
    }

    // POP Operation

    static int pop(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }
    int element = stack[top--];
    System.out.println("The popped element is:" + element);
    return element;
    }

    // Peek Operation
    static void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
            System.out.println("Top element: " + stack[top]);
        }
    // Display Operation

    static  void display(){
        if(isEmpty){
            System.out.println("Stack is Empty");
        }
        for(int i = top; i > 0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("========STACK MENU========");
            System.out.println("1. Is stack empty ?");
            System.out.println("2. Is stack full ?");
            System.out.println("3. stack size");
            System.out.println("4. stack push");
            System.out.println("5. stack pop");
            System.out.println("6. stack peek");
            System.out.println("7. stack peek");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Is stack empty?" + isEmpty());
                    isEmpty();
                    break;

                case 2:
                    System.out.println("Is stack full?" + isFull());
                    isFull();
                    break;

                case 3:
                    System.out.println("Is stack size?" + stackSize());
                    stackSize();
                    break;

                case 4:
                    System.out.println("Enter the element:");
                    int element = sc.nextInt();
                    push(element);
                    break;    

                case 5:
                    pop();
                    break; 

                case 6:
                    peek();
                    break;

                case 7:
                    display();
                    break;

                case 8:
                    System.out.println("thank you. Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
            }

        }
    }
} 

// infix, prefix, postfix