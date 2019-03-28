public class Main {

    public static void main(String[] args) {
        MenuComponent homeMenu = new Menu("Home");
        MenuComponent viewMenu = new Menu("View");
        MenuComponent editMenu = new Menu("Edit");

        MenuComponent menus = new Menu("Menus");
        menus.add(homeMenu);
        menus.add(viewMenu);
        menus.add(editMenu);


        homeMenu.add(new MenuItem("open"));
        homeMenu.add(new MenuItem("close"));
        homeMenu.add(new MenuItem("open as"));
        homeMenu.add(new MenuItem("new project..."));

        viewMenu.add(new MenuItem("Size"));
        viewMenu.add(new MenuItem("Canva"));

        editMenu.add(new MenuItem("Copy"));
        editMenu.add(new MenuItem("Past"));
        editMenu.add(new MenuItem("Cut"));

        Client client = new Client(menus);

        client.printMenu();
    }
}
