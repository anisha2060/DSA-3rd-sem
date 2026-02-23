class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }     
}                              
public class stackLinkedList{
    Node top=null;

    //PUSH OPERATION
    public void push(int element){
        Node newNode=new Node(element);

        //New node pionts to the current top
        newNode.next=top;

        //top moves to new node 
        top=newNode;
        System.out.println("Element insert:"+element);
    }
    // public static void main(String[] args) {
    //     StackImplUsingLinkedList Stack=new StackImplUsingLinkedList();
    //     Stack.push(50);
    //     Stack.push(60);
    //     Stack.push(70);
    // }

    //POP OPERATION
    public int pop() {
        if(top==null){
            System.out.println("Stack is underflow! stack is empty");
            return -1;
        }
        int element=top.data;
        top=top.next;//top moves to next address
        return element;
    }
    // DISPLAY OPERATION
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // MAIN METHOD (only one)
    public static void main(String[] args) {
        stackLinkedList stack = new stackLinkedList();

        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack elements:");
        stack.display();
    }
}