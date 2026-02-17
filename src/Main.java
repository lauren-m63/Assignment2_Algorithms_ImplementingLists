public class Main {


    public static void main(String[] args) {

        runAList();
        runSingleLinkedList();
    }


    public static void runAList(){
        AList alist = new AList();
        Song song = new Song();

        alist.addy(song);
        System.out.println(alist.toString());
    }

    public static void runSingleLinkedList(){
        SinglyLinkedList list = new SinglyLinkedList();
        Song song = new Song();

        list.addy(song);
        System.out.println(list.toString());
    }
}
