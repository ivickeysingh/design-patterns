package patterns.iterator;

import java.util.Iterator;

public class DinnerHouse implements Menu{
    private final int size = 10;
    private int i = 0;
    private MenuItem[] items = new MenuItem[size];

    public boolean addMenuItem(final MenuItem menuItem) {
        if(i < size){
            items[i++] = menuItem;
            return true;
        }
        return false;
    }

    public Iterator createMenuIterator() {
        return new DinnerIterator(items);
    }
}
