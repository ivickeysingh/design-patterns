package patterns.composite;

import patterns.composite.models.MenuComponent;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(final MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
