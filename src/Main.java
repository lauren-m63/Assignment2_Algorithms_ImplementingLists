public class Main {

    static Song song1 = new Song("Coral Crown", "artist: Darren Korb",  4.07);
    static Song song2 = new Song("CASANOVE POSSE", "artist: ALI", 4.00 );
    static Song song3 = new Song();

    public static void main(String[] args) {

        runAList();
        runSingleLinkedList();
        runDoublyLinkedList();
    }


    public static void runAList(){
        AList alist = new AList();
        Song song = new Song();

        alist.addy(song);
        alist.addy(song1);
        alist.addy(song2);
        alist.addy(song3);
        System.out.println(alist.toString());
        alist.removy(1);
        System.out.println(alist.toString());
    }

    public static void runSingleLinkedList(){
        SinglyLinkedList list = new SinglyLinkedList();
        Song song = new Song();

        list.addy(song);
        list.addy(song1);
        list.addy(song2);
        list.addy(song3);
        System.out.println(list.toString());
    }

    public static void runDoublyLinkedList(){
        DoublyLinkedList list = new DoublyLinkedList();
        Song song = new Song();

        list.addy(song);
        list.addy(song1);
        list.addy(song2);
        list.addy(song3);
        System.out.println(list.toString());
    }
}
