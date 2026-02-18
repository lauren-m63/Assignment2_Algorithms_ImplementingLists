package generic;

public class SinglyLinkedListGeneric<T> {

    T data;
    SingleLNodeGeneric<T> head;
    SingleLNodeGeneric<T> tail;
    int index=0;

    public SinglyLinkedListGeneric(){
        head = null;
        //tail = null;
    } // construtor makes my empty list with two nodes being null the head and tail== wait i dont think i should put tail

    public void addy(T p){
        // so when i add i need to append it to the tail okay so i should put a tail and then also make the previous pointer point to new node
        if (head == null){
            head = new SingleLNodeGeneric<>(p); // new one is head if empty
            tail = head;// make tail also head lol i dont need this
        }
        else{
            tail.next = new SingleLNodeGeneric<>(p); // make tail .next to contie oops
            // now i need to make this new one the tail
            tail = tail.next;
        }
        index++;
    }

    public void removy(int pos){
        // to remove ill delete wait should i be keeping track of how many im adding
        // ill do that and then delete it and then i just have to bridge the one so
        // pos.previous ? now points to wait no yes that points to pos.next-- do i have a preivous varibale
        // i guess id reference th e index ill make now

        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (pos < 0 || pos>=index){
            System.out.println("Invalid position");
            return;
        }
        if (pos==0){
            head = head.next;
            if (head == null){
                tail = null;
            } // also need to set tail to null or else its weird
        }
        else{
            // okay i cant actually use the index index is just size maybe ill rename that i forogt you only know bc of the pointers
            SingleLNodeGeneric<T> temp = head; // just a starter
            for (int i=0; i<pos-1; i++){ // go to node before
                temp = temp.next; // the pos one is now inside temp -- why would i jsut go to the before one and make pos = temp
                //okay so when im looping through the line is saying make temp.next now it is temp which is removing it because i am writing over it oops
                // so now ive written over my temp with the previous so now i want to make this one temp no point to the temp.next.next which is yeah bc its temp then temp.next(pos) then temp.next.next so temp.next should now be the next next okay
            }
            temp.next = temp.next.next; // i want to make the one before pos point to the one after pos
            if (temp.next == null){
                tail=temp;
            }
        }
        index--;

    }// end removvy


    @Override // if i dont override then it doesnt tostring it
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++){}
        //sb.append(Sin[i]).append("\n"); // i cant use the plus i have to use append
        // i want to append the nodes so i just use the loop for size so i should do like head and then .next and keep goig
        //sb.append(head.append("\n"))
        SingleLNodeGeneric<T> node = head;
        while (node != null){ // i can say if not null instread of before it reaches tail that makes way less sense
            sb.append(node.data).append("\n");
            node = node.next; // keeps moving forwards since its in a loop
        }
        return sb.toString();
    }
}
