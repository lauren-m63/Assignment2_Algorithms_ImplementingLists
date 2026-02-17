/*An empty constructor: Should create an empty AList. This implies having an array initialized to an
initial maxSize and setting size to 0.

• void addy(Song p): Should add a new node with the given song to the AList and resize when
appropriate.

• void removy(int pos): Should remove the item at position pos from the AList. This implies shuffling
items if necessary and updating the size.

• String toString(): This method should return a string containing all the elements in the AList. Each
element should be in a new line when the resulting String is printed.

 */

// i have to make class of array list or it creates list manually in constructor
// arraylist not array

// can i put type as a parameter?-- or it says to do nodes so is it a linked list which is an array inisitlixed to a size
// wait -- Implement an Array-based List that stores Song instances

import org.w3c.dom.Node;

import java.util.ArrayList;

public class AList {
    int maxSize;
    Node head;
    Node tail;
    Song[] list;

    public AList(){
        maxSize = 10;
        list = new Song[maxSize];
    }

    public AList(int maxSize){
        this.maxSize = maxSize;
        list = new Song[maxSize];
    }

    public void addy(Song p){
        // add new node and resize array-- so just add a song and then if it is full then adjust array size

    }

    public void removy(int pos){

    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < maxSize; i++){
            sb.append(list[i] + "\n");
        }
        return sb.toString(); // change
    }

}
