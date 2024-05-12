import java.util.LinkedList;

public class linkedList {
 int size;
linkedList(){
    this.size=0;
}

    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
        //addFirst
        public void addFirst(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;

            }
            newNode.next=head;
            head=newNode;

        }
        //addLast
        public void addLast(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;


        }
        //DeleteFirst
        public void delFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            size--;
            head=head.next;
        }
        //DeleteLast
        public void delLast(){
            if(head==null){
                System.out.println("list is empty");
                return;

            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secnode=head;
            Node lastNOde=head.next;
            while (lastNOde.next!=null) {
                lastNOde=lastNOde.next;
                secnode=secnode.next;
            }
            secnode.next=null;
            
        }
        //recursive
        void reverseIterative(){
            if(head==null||head.next==null){
                return;
            }
            Node prNode=head;
            Node cNode=head.next;
            while(cNode!=null){
                Node nexNode=cNode.next;
                cNode.next=prNode;

                prNode=cNode;
                cNode=nexNode;
            }
            head.next=null;
            head=prNode;
        }
        public Node reverseRecursive(Node head){
            Node newNode=reverseRecursive(head.next);

            head.next.next=head;
            head.next=null;

            return newNode;
        }

        public void PrintList(){
            if(head==null){
                System.out.println("list is empty");
            }
            Node currNode=head;
            while(currNode !=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");

        }
        public int getSize(){
            return size;
        }
    
    public static void main(String[] args) {
       
        linkedList list=new linkedList();
        list.addFirst("is");
        list.addFirst("this");
        list.PrintList();
        list.addLast("LinkedList");
        list.PrintList();
        list.addFirst("wow");
        list.PrintList();

        list.delFirst();
        list.PrintList();

        list.delLast();
        list.PrintList();
        System.out.println(list.getSize());

        list.addFirst("look");
        list.PrintList();
        

        list.head=list.reverseRecursive(list.head);
        list.PrintList();

        
    }
    
}
