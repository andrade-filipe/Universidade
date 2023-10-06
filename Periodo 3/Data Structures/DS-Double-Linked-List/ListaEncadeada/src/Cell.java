public class Cell {
    private Cell previous;
    private Cell next;
    private Object element;

    public Cell() {
    }

    public Cell(Object element) {
        this.element = element;
    }

    public Cell(Cell previous, Cell next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Cell getPrevious() {
        return previous;
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}