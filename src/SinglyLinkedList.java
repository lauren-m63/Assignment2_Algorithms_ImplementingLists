/*
Implement a Singly Linked List that stores Song instances
You will implement two classes from scratch, SLNode and SLlist. Your SLList class must implement the
following operations:
• An empty constructor: Should create an empty SLList. This implies having a member data element
Head of type SLNode initialized to NULL.

• void addy(Song s): Should add a new SLNode with the given song to the end of the SLList and
update the pointers appropriately.

• void removy(int pos): Should remove the item at position pos from the SLList. This implies
updating the pointers appropriately.
• String toString(): This method should return a string containing all the elements in the SLList. Each
element should be in a new line when the resulting String is printed.
 */

public class SinglyLinkedList {
    SinglyLinkedNode head;
    SinglyLinkedNode tail;

    public SinglyLinkedList(){
        head = null;
        //tail = null;
    } // construtor makes my empty list with two nodes being null the head and tail== wait i dont think i should put tail

    public void addy(Song p){
        // so when i add i need to append it to the tail okay so i should put a tail and then also make the previous pointer point to new node
        if (head == null){
            head = new SinglyLinkedNode(p); // new one is head if empty
            tail = head;// make tail also head lol i dont need this
        }
        else{
            tail.next = new SinglyLinkedNode(p); // make tail .next to contie oops
            // now i need to make this new one the tail
            tail = tail.next;
        }
    }

    public void removy(int pos){
        // to remove ill delete wait should i be keeping track of how many im adding
        // ill do that and then delete it and then i just have to bridge the one so
        // pos.previous ? now points to wait no yes that points to pos.next-- do i have a preivous varibale
        // i guess id reference th e index ill make now
    }

    @Override // if i dont override then it doesnt tostring it
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++){
            sb.append(list[i]).append("\n"); // i cant use the plus i have to use append
        }
        return sb.toString(); // change
    }


}// LAST BRACKET- END CLASS


