import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Item> saltyItems;
    private List<Item> sweetItems;

    public Customer(String name) {
        this.name = name;
        this.saltyItems = new ArrayList<>();
        this.sweetItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSaltyItem(Item item) {
        saltyItems.add(item);
    }

    public void addSweetItem(Item item) {
        sweetItems.add(item);
    }

    public List<Item> getSaltyItems() {
        return saltyItems;
    }

    public List<Item> getSweetItems() {
        return sweetItems;
    }
}
