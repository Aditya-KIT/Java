class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    public class LinkedList{
        public static void main(String[] args){
            Node a= new Node(10);
            Node b= new Node(40);
            Node c= new Node(100);
            Node d= new Node(150);

            a.next=b;
            b.next=c;
            c.next=d;

            System.out.println(a.val);
            System.out.println(a.next);
            System.out.println(b.val);
        }
    }
        
    }

