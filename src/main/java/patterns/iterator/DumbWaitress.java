package patterns.iterator;

import java.util.Iterator;

public class DumbWaitress implements Waitress{
    private final Menu lunchMenu;
    private final Menu dinnerMenu;

    public DumbWaitress(final Menu lunchMenu, final Menu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
        this.lunchMenu = lunchMenu;
    }
    public void printMenu() {
        System.out.println("------Lunch Menu--------\n");
        display(lunchMenu.createMenuIterator());
        System.out.println("\n\n------Dinner Menu--------\n");
        display(dinnerMenu.createMenuIterator());
    }

    private void display(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
