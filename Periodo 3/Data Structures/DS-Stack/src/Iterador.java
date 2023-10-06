import java.util.Iterator;

public class Iterador<Generic> implements Iterator{
    private Cell currentCell;

    public Iterador(Cell currentCell) {
        this.currentCell = currentCell;
    }

    /**
     * Verifica se a célula atual está vazia, indicando se existe um próximo elemento
     */
    @Override
    public boolean hasNext() {
        return currentCell != null;
    }

    /**
     * retorna o próximo elemento que está referenciado pelo atual elemento
     */
    @Override
    public Object next() {
        Generic element = (Generic) currentCell.getElement();
        currentCell = currentCell.getNext();
        return element;
    }

    /**
     * retorna a célula atual do iterador
     */
    public Cell getCurrentCell() {
        return currentCell;
    }
}
