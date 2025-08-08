package java_hw_7.task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {

    private List<T> elements = new ArrayList<>();

    public void addItem(T item) {
        System.out.printf("%s added.", item);
        elements.add(item);
    }

    public int getItemCount() {
        return elements.size();
    }

    public List<T> retrieveAll() {
        List<T> duplicate = new ArrayList<>(elements);
        elements.clear();
        return duplicate;
    }

    public List<T> viewItems() {
        return new ArrayList<>(elements);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void clear() {
        System.out.println("Warehouse cleanup successful.");
        elements.clear();
    }
}
