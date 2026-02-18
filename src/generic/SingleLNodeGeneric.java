package generic;

public class SingleLNodeGeneric <T>{
    SingleLNodeGeneric next;
    SingleLNodeGeneric previous;
    T data;

    public SingleLNodeGeneric(T data) {
        this.data =data;
        this.next = null;
    }
}
