import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private ArrayList menuComponents = new ArrayList();

    private String name;

    public Menu(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int position) {
        return (MenuComponent)menuComponents.get(position);
    }

    @Override
    public void operation() {

        for (Object component:menuComponents) {
            MenuComponent component1 = ((MenuComponent)component);
            System.out.println(component1.getName());
            component1.operation();

        }
    }
}
