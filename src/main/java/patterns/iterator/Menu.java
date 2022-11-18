package patterns.iterator;

import java.util.Iterator;

public interface Menu {
    public Iterator createMenuIterator();
    public boolean addMenuItem(MenuItem menuItem);
}
