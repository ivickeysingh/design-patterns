package patterns.composite.models;

import java.util.Iterator;

public interface MenuComponent {
    public void print();

    default public boolean add(final MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    default public boolean remove(int idx) {
        throw new UnsupportedOperationException();
    }
    default public MenuComponent getChild(int idx) {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator();
}
