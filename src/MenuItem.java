public class MenuItem extends MenuComponent{

    private String name;

    public MenuItem(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void operation() {
        System.out.println("   I am  "+getName());
    }
}
