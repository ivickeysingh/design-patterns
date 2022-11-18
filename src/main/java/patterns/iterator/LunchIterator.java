package patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class LunchIterator implements Iterator {
    private List<MenuItem> items;
    private int i = 0;

    public LunchIterator(final List<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return !items.isEmpty() && i != items.size();
    }

    public Object next() {
        i++;
        return items.get(i-1);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
