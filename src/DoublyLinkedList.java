/*
mplement a Doubly Linked List that stores Song instances
You will implement two classes from scratch, DLNode and DLList. Your DLList class must implement
the following operations:
• An empty constructor: Should create an empty DLList. This implies having a member data element
Head of type DLNode initialized to NULL.
• void addy(Song s): Should add a new DLNode with the given song to the DLList and update the
pointers appropriately.
• void removy(int pos): Should remove the item at position pos from the DLList. This implies
updating the pointers appropriately.
• String toString(): This method should return a string containing all the elements in the DLList. Each
element should be in a new line when the resulting String is printed.

 */


import java.util.ArrayList;

// okay so basically the same thing but i just got to link it twice

public class DoublyLinkedList {
    SinglyLinkedNode head;
    SinglyLinkedNode tail;
    int index=0;

    public DoublyLinkedList(){
        head = null;
    }

    public static void addy(Song p){

    }

    public static void removvy(int pos){

    }


    @Override // if i dont override then it doesnt tostring it
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++){}
        //sb.append(Sin[i]).append("\n"); // i cant use the plus i have to use append
        // i want to append the nodes so i just use the loop for size so i should do like head and then .next and keep goig
        //sb.append(head.append("\n"))
        SinglyLinkedNode node = head;
        while (node != null){ // i can say if not null instread of before it reaches tail that makes way less sense
            sb.append(node.data).append("\n");
            node = node.next; // keeps moving forwards since its in a loop
        }
        return sb.toString();
    }


} // LAST BRACKET






