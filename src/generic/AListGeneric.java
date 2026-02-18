package generic;

public class AListGeneric <T>{

    int maxSize;
    T[] list;
    int index= 0;

    public AListGeneric(){
        maxSize = 10;
        //list = new T[maxSize]; // i need casting
        list = (T[]) new Object[maxSize];
    }

    public AListGeneric(int maxSize){
        this.maxSize = maxSize;
        list = (T[]) new Object[maxSize];    }

    public void addy(T p){
        // add new node and resize array-- so just add a song and then if it is full then adjust array size

        // if it is full resize it
        if (index == maxSize){
            maxSize *= 2;
           T[] temp = (T[]) new Object[maxSize];
            //T[] temp = new T[maxSize];
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
