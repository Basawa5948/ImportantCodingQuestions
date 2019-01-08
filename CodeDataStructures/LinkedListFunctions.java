package DataStructures;

public class LinkedListFunctions {

    Node head;

    public void insert(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;

        if(head==null){
            head = node;
        }else{
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node n = head;
        while (n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void insertAtStart(int value){
        Node node = new Node();
        node.data = value;
        node.next = head;
        head = node;
    }

    public void insertAt(int index,int value){
        Node node = new Node();
        node.data = value;
        node.next = null;

        if(index == 0){
            insertAtStart(value);
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node n = head;
            for(int i =0;i<index-1;i++){
                n = n.next;
            }
            Node n1= null;
            n1 = n.next;
            n.next = n1.next;
        }
    }
}
