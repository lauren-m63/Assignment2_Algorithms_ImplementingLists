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

//import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

public class AList {
    int maxSize;
    Song[] list;
    int index= 0;

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

        // if it is full resize it
        if (index == maxSize){
            maxSize *= 2;
            Song[] temp = new Song[maxSize];
            System.arraycopy(list, 0, temp, 0, index); // copy my list from 0 into my new list until index counter is hit
            list = temp;
        }
        list[index] = p; // keep track of where i am
        index++; // so i strat at 0 so its put into 0 and then the next one will be 1
    }

    public void removy(int pos){
        if (pos < 0 || pos>= index){ // check if chill
            System.out.println("Invalid position");
        }
        for (int i = pos; i < index-1; i++){ // out of bounds if not -1 bc trying to access plus 1
            list[i] = list[i+1]; // shift everything down one starting at the one you delete- itll jsut overwrite it
                    // my thing is ordered so i cant just make it null i have to shift everythign
        }
        index--;
    }
    @Override // if i dont override then it doesnt tostring it
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++){
            sb.append(list[i]).append("\n"); // i cant use the plus i have to use append
        }
        return sb.toString(); // change
    }

}
