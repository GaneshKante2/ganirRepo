
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class leetcode {
    void printlist(Node head){
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node p1=new Node(10);
        Node p2=new Node(30);
        Node p3=new Node(30);
        Node p4=new Node(40);

        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        Node head=p1;
        leetcode obj=new leetcode();
        obj.printlist(head);

        

        
    }
}
    
    

