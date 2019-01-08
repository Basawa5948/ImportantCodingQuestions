package DataStructures;

public class LinkedListImplementation {
    public static void main(String[] args){
        LinkedListFunctions linkedListFunctions = new LinkedListFunctions();

        linkedListFunctions.insert(5);
        linkedListFunctions.insert(6);
        linkedListFunctions.insert(7);
        linkedListFunctions.insert(8);
        linkedListFunctions.insert(9);

        linkedListFunctions.insertAtStart(1);

        linkedListFunctions.insertAt(3,4);
        linkedListFunctions.insertAt(0,0);

        linkedListFunctions.deleteAt(0);

        linkedListFunctions.deleteAt(3);

        linkedListFunctions.show();
    }
}
