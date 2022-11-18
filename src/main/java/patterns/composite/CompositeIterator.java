package patterns.composite;

import patterns.composite.models.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(final Iterator<MenuComponent> menuComponentIterator) {
        stack.push(menuComponentIterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> menuComponentIterator = stack.peek();
            if (!menuComponentIterator.hasNext()){
                stack.pop();
                return false;
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(!hasNext()){
            return null;
        }else {
            Iterator<MenuComponent> iterator = stack.pop();
            MenuComponent menuComponent = iterator.next();
            stack.push(menuComponent.createIterator());
            return menuComponent;
        }
    }
}
