package patterns.composite;

import patterns.composite.models.MenuComponent;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Dinner");
        MenuComponent lunchMenu = new Menu("LUNCH MENU", "Lunch");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert Menu");
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);
        dinnerMenu.add(new MenuItem("Pasta", "Spagheti", true, 200));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Gulab jamun", "White gulab jamun", true, 90));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
