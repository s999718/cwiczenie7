import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        // Добавляем 10 новых объектов Item
        for (int i = 1; i <= 10; i++) {
            items.add(new Item(i, "Предмет" + i));
        }

        // Извлекаем первые пять элементов с помощью subList()
        List<Item> firstFiveItems = items.subList(0, 5);

        // Помещаем эти элементы в HashSet
        HashSet<Item> itemsSet = new HashSet<>(firstFiveItems);

        // Выводим элементы HashSet на консоль
        for (Item item : itemsSet) {
            System.out.println("Идентификатор: " + item.getId() + ", Название: " + item.getName());
        }
    }
}
