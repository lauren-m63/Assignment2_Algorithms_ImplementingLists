public class Main {


    public static void main(String[] args) {

        runAList();
    }


    public static void runAList(){
        AList alist = new AList();
        Song song = new Song();

        alist.addy(song);
        System.out.println(alist.toString());
    }
}
