package patterns.iterator;

import java.util.Iterator;

public class DinnerIterator implements Iterator {
    private int i = 0;
    private MenuItem[] items;

    public DinnerIterator(final MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return i >= 0 && i < items.length && items[i] != null;
    }

    public Object next() {
        return items[i++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
