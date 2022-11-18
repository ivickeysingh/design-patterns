package patterns.composite;

import patterns.composite.models.MenuComponent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Menu implements MenuComponent {
    private String name;
    private String description;
    private List<MenuComponent> menuComponents = new LinkedList<MenuComponent>();

    public Menu(final String name,
                final String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print() {
        System.out.println("\nName: " + name);
        System.out.println("Description: " + description);

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    public boolean add(MenuComponent menuComponent) {
        return menuComponents.add(menuComponent);
    }

    public boolean remove(int idx) {
        menuComponents.remove(idx);
        return true;
    }

    public MenuComponent getChild(int idx) {
        return menuComponents.get(idx);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return null;
    }
}
