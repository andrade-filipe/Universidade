import java.util.Iterator;

public class Iterador<Generic> implements Iterator{

    private Cell currentCell;

    public Iterador(Cell currentCell) {
        this.currentCell = currentCell;
    }

    @Override
    public boolean hasNext() {
        if(currentCell !=null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Generic element = (Generic) currentCell.getElement();
        currentCell = currentCell.getNext();
        return element;
    }

    public Object previous() {
        Generic element = (Generic) currentCell.getElement();
        currentCell = currentCell.getPrevious();
        return element;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }
}
