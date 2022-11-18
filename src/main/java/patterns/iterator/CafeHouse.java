package patterns.iterator;

public class CafeHouse {
    public static void main(String[] args) {
        Menu dinnerMenu = new DinnerHouse();
        Menu lunchMenu = new LunchHouse();
        lunchMenu.addMenuItem(new MenuItem("Samosa", "A north indian snack", 12.0));
        dinnerMenu.addMenuItem(new MenuItem("Chicken Do Pyaza", "A north indian chicken spicy gravy", 285.0));
        Waitress waitress = new DumbWaitress(lunchMenu, dinnerMenu);
        waitress.printMenu();
    }
}
