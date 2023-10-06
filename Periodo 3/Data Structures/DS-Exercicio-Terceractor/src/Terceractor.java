import java.util.Iterator;

public class Terceractor<Generic> implements Iterator {
    Generic[] items;
    int position = 0;

    //construtor iterador
    public Terceractor(Generic[] items) {
        this.items = items;
    }

    //verifica se existe dado
    public boolean hasNext() {
        if (position < 0 || position >= items.length) {
            return false;
        } else {
            return true;
        }
    }
    //retorna proximo valor
    public Object next() {
        Object item = items[position];
        position++;
        return item;
    }
}
