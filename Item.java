import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "1"));
        items.add(new Item(2, "2"));
        items.add(new Item(3, "3"));
        items.add(new Item(4, "4"));
        items.add(new Item(5, "5"));

        for (Item item : items) {
            item.show();
        }

        HashMap<Integer, String> map = new HashMap<>();
        for (Item item : items) {
            map.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("id: " + entry.getKey() + ", name: " + entry.getValue());
        }
    }
}
