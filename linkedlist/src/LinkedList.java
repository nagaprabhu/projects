import java.util.HashSet;

public class LinkedList {

    class node{
        int data;
        node NextNode;
        node(int i, node nextNode){
            data=i;
            NextNode=null;
        }
    }


    private node head;
    private node tail;
    private int size;

    LinkedList(){
        head=null;
        tail=null;
        size=0;
    }


    public void InsertAtHead(int n){
        size++;
        node newNode = new node(n,head);
        node tmp=head;
        head=newNode;
        head.NextNode=tmp;

        if (size==1){tail=head;}
    }

    public void InsertAtTail(int n){
        size++;
        node newNode = new node(n,null);
        tail.NextNode = newNode;
        tail=newNode;
        if (size==1){head=tail;}
    }

    public void find(int n){
        node ptr;
        ptr=head;
        while(ptr!=null){
            if (ptr.data == n){
                System.out.println("Found" + n +"at "+ ptr);
                return ;
            }
            ptr=ptr.NextNode;
        }
        System.out.println("Could not find " + n );
    }
    public void reverse(){
        node next=null;
        node prev=null;

        node tmp_head=head;
        node tmp_tail=tail;
        node ptr=head;
        do{
            next=ptr.NextNode;
            ptr.NextNode=prev;
            prev=ptr;
            //System.out.println("ptr=" + ptr.data+" - "+head.data+" - "+tail.data);
            ptr=next;
        }while(ptr.NextNode != null);

        ptr.NextNode=prev;
        head=ptr;

        //head=tmp_tail;
        tail=tmp_head;
    }

    public void findmid(){
        node ptr_slow=head;
        node ptr_fast=head;

        while(ptr_fast!=null){
            ptr_slow=ptr_slow.NextNode;
            ptr_fast= ptr_fast.NextNode;
            if(ptr_fast!=null){ptr_fast= ptr_fast.NextNode;}else{break;}
        }
        System.out.println("mid" + ptr_slow.data);
    }

    public boolean detectloop(){
        HashSet<node> Set = new HashSet<node>();
        node ptr=head;
        //tail.NextNode = head; Force loop.
        while(ptr!=null){
            if(Set.contains(ptr)){
                System.out.println("loop :" + ptr.data);
                return true;
            }
            Set.add(ptr);
            ptr=ptr.NextNode;
        }
        System.out.println("no loop");
        return false;
    }

    public void removeDuplicate(){
        node ptr = head;
        node prev = null;
        HashSet<Integer> Set = new HashSet<Integer>();
        while (ptr!=null){
            if(Set.contains(ptr.data)){
                prev.NextNode=ptr.NextNode;
                System.out.println("Removed duplicate :"+ ptr.data);
            }else{
                prev=ptr;
            }
            Set.add(ptr.data);

            ptr=ptr.NextNode;
        }
    }

    public void remove(int n){
        node prev=null;
        node ptr=head;
        while(ptr!=null){
            if(ptr.data == n){ // Found the entry
                if (prev==null) { //deleting the head
                    System.out.println("Deleted the head" + n);
                    head = head.NextNode;
                    return;
                }
                if (ptr.NextNode==null) { //deleting the tail
                    prev.NextNode = null;
                    tail=prev;
                    System.out.println("Deleted the tail" + n);
                    return;
                }
                prev.NextNode=ptr.NextNode;
                System.out.println("Deleted the body node" + n);
            }
            prev=ptr;
            ptr=ptr.NextNode;
        }
    }

    public void findNthFromEnd(int n){
        node ptr=head;
        int counter=0;
        node delay_ptr=head;
        while(ptr!=null){
            counter++;
            if (counter>=n){delay_ptr=delay_ptr.NextNode;}
            ptr=ptr.NextNode;
        }
        if (counter>=n) {System.out.println(n+"th value from end:" + delay_ptr.data);}
        else{System.out.println(n+"th value not possible. List length:" + counter);}
    }

    public void traverse(){
        node ptr;
        ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+"=>");
            ptr=ptr.NextNode;
        }
        System.out.println("TAIL");
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.InsertAtHead(10);
        LL.InsertAtTail(20);
        LL.InsertAtHead(30);
        LL.InsertAtTail(40);
        for (int i = 1; i <= 10; i++){
            LL.InsertAtHead(i);
        }

            LL.traverse();

        LL.find(100);
        LL.find(40);
        LL.find(40);
        LL.find(41);

        LL.remove(40);
        LL.remove(1);

        LL.traverse();

        LL.reverse();
        LL.traverse();

        LL.detectloop();
        LL.findmid();
        LL.removeDuplicate();
        LL.traverse();
        LL.findNthFromEnd(3);
        LL.findNthFromEnd(5);
        LL.findNthFromEnd(30);

    }
}
