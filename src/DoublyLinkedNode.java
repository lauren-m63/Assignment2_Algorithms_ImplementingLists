public class DoublyLinkedNode {

    Song data;
    DoublyLinkedNode next;
    DoublyLinkedNode previous;

    public DoublyLinkedNode(Song data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
