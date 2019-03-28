public class Client {
    private MenuComponent allMenus;

    public Client(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){

        allMenus.operation();
    }
}
