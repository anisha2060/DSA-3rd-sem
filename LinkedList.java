import java.util.Scanner;

public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //1.Insert at first
    public void insertAtBeginning(int element){
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
        System.out.println("Element inserted at the beginning");
    }

    //2.Insert at last
    public void insertAtLast(int element){
        Node newNode=new Node(element);
        if(head==null) {
            head=newNode;
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while ((temp.next!=null)) {
            temp=temp.next;
        }
        temp.next=newNode;
        System.out.println("Inserted at end");
    }


    //3.Traverse(Display the list)
    public void traverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        System.out.println("list of element:");
        while(temp!=null){
            System.out.print(temp.data+"");
            temp=temp.next;
        }
    }

    //Size of linked list
    public int size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        return count;
    }

    //Search element
    public void Search(int key){
        Node temp=head;
        int position=1;

        while (temp!=null) {
            if(temp.data==key){
                System.out.println("Element found at position"+position);
                return;
            }
            temp=temp.next;
            position++;
        }
        System.out.println("Element not found");
    }

    //Delete from beginning
    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("Underflow error:List is empty");
            return;
        }
        head=head.next;
        System.out.println("Deleted from beginning");
    }

    //Delete from last
    public void deleteFromLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
           head=null;
           System.out.println("Delete last element");
           return;
        }

        // Node secondLast=head;
        // Node lastnNode=head.next;
        // while (lastnNode.next!=null) {
        //     lastnNode=lastnNode.next;
        //     secondLast=secondLast.next;    
        // }
        // secondLast.next=null;
        // System.out.println("Delete last element");
         Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Deleted last element");
    }
    public static void main(String[] args) {
        LinkedList linkedlist=new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========Linked list ADT MENU=========");
            System.out.println("1. Insert at Beginning?");
            System.out.println("2. Insert at End?");
            System.out.println("3. Traverse");
            System.out.println("4. size");
            System.out.println("5. Search for an element");
            System.out.println("6. Delete from beginning");
            System.out.println("7.Delete from last");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter element:");
                    linkedlist.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element:");
                    linkedlist.insertAtLast(sc.nextInt());
                    break;

                case 3:
                    linkedlist.traverse();
                    break;

                case 4:
                    System.out.print("size of list:"+linkedlist.size());
                    break;

                case 5:
                    System.out.print("Enter element to search:");
                    linkedlist.Search(sc.nextInt());
                    break;

                case 6:
                    linkedlist.deleteFromBeginning();
                    break;
            
                case 7:
                    linkedlist.deleteFromLast();
                    break;


                case 8:
                    System.out.println("Thank you. Exiting Program....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}