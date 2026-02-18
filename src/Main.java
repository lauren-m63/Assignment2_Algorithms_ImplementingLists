import generic.AListGeneric;
import generic.DoublyLinkedListGeneric;
import generic.SinglyLinkedListGeneric;

public class Main {

    static Song song1 = new Song("Coral Crown", "artist: Darren Korb",  4.07);
    static Song song2 = new Song("CASANOVE POSSE", "artist: ALI", 4.00 );
    static Song song3 = new Song();

    public static void main(String[] args) {

        runAList();
        runSingleLinkedList();
        runDoublyLinkedList();
    }

    public static void runGeneric(){
        AListGeneric<Song> songsList = new AListGeneric<>();
        SinglyLinkedListGeneric<Song> SinglesongsList = new SinglyLinkedListGeneric<>();
        DoublyLinkedListGeneric<Song> DoublesongsList = new DoublyLinkedListGeneric<>();

        System.out.println(songsList.toString()); // empty rn

        songsList.addy(song1);
        songsList.addy(song2);
        songsList.addy(song3);

        System.out.println(songsList.toString());

        DoublesongsList.addy(song1);
        DoublesongsList.addy(song2);
        DoublesongsList.addy(song3);

        System.out.println(SinglesongsList.toString());

        SinglesongsList.addy(song1);
        SinglesongsList.addy(song2);
        SinglesongsList.addy(song3);

        System.out.println(DoublesongsList.toString());

        songsList.removy(2);

        System.out.println(songsList.toString());
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
