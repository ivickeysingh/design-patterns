package patterns.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LunchHouse implements Menu{
    private List<MenuItem> items = new LinkedList<MenuItem>();

    public boolean addMenuItem(final MenuItem menuItem) {
        return items.add(menuItem);
    }

    public Iterator createMenuIterator() {
        return new LunchIterator(items);
    }
}
