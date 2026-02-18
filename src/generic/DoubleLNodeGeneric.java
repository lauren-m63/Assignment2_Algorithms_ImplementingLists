package generic;

public class DoubleLNodeGeneric<T> {
    DoubleLNodeGeneric next;
    DoubleLNodeGeneric previous;
    T data;

    public DoubleLNodeGeneric(T data) {
        this.next = null;
        this.previous = null;
        this.data =data;
    }
}
