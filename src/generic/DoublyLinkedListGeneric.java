package generic;

public class DoublyLinkedListGeneric <T>{
    T data;
    DoubleLNodeGeneric<T> head;
    DoubleLNodeGeneric<T> tail;
    int index=0;

    public DoublyLinkedListGeneric(){
        head = null;
    }

    public void addy(T p){
        if (head == null){
            head = new DoubleLNodeGeneric<>(p); // new one is head if empty
            tail = head;// make tail also head lol i dont need this
        }
        else{
            tail.next = new DoubleLNodeGeneric<>(p); // make tail .next to contie oops
            // now i need to make this new one the tail
            tail.next.previous = tail; // so im making my tail point to the new node, making my new nodes previous variable be the old tail
            tail = tail.next; // then im making my new one update to now be the tail yes
        }
        index++;
    }

    public void removvy(int pos){
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
            if (head != null) {
                head.previous = null;
            } else{
                tail = null;
            }// end else
        }// end if
        // also need to set tail to null or else its weird
        else{
            DoubleLNodeGeneric<T> temp = head; // just a starter
            for (int i=0; i<pos-1; i++){ // go to node before bc i stop 2 before in the loop its pos-1 which is pos-2 so temp is temp.next which is pos -1
                temp = temp.next; // now temp is pos-1
            }

            temp.next = temp.next.next;
            if(temp.next != null){
                temp.next.previous = temp;
            }
            else{
                tail = temp;
            }
        }
        index--;
    }


    @Override // if i dont override then it doesnt tostring it
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++){}
        //sb.append(Sin[i]).append("\n"); // i cant use the plus i have to use append
        // i want to append the nodes so i just use the loop for size so i should do like head and then .next and keep goig
        //sb.append(head.append("\n"))
        DoubleLNodeGeneric<T> node = head;
        while (node != null){ // i can say if not null instread of before it reaches tail that makes way less sense
            sb.append(node.data).append("\n");
            node = node.next; // keeps moving forwards since its in a loop
        }
        return sb.toString();
    }
}
