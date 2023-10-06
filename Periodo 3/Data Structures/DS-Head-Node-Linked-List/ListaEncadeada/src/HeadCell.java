public class HeadCell {
    private Cell head;
    private Cell tail;

    public HeadCell() {
        this.head = new Cell();
        this.tail = head;
    }

    public Cell getHead() {
        return head;
    }

    public void setHead(Cell head) {
        this.head = head;
    }

    public Cell getTail() {
        return tail;
    }

    public void setTail(Cell tail) {
        this.tail = tail;
    }
}
