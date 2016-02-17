import java.util.ArrayList;
import java.util.List;

public class Bag {

    private String size;
    private String color;
    private List<String> itemsOfBag = new ArrayList<>();

    public Bag (String size, String color, List itemsOfBag) {
        if (size == null || color == null)
            throw new NullPointerException();
        this.size = size;
        this.color = color;
        this.itemsOfBag = itemsOfBag;
    }

    public String getSize() {
        return size;
    }

    public String getColor() { return color; }

    public List<String> addOneRing() {
        itemsOfBag.add("One Ring");
        return itemsOfBag;
    }

    public List<String> addThingsToStack(String thingToAdd) {
        itemsOfBag.add(thingToAdd);
        Stack stackOfBag = new Stack();
        stackOfBag.randomizeItemsIntoStack(itemsOfBag);
        return itemsOfBag;
    }

    public List<String> printCurrentStack() {
        itemsOfBag.stream()
                .forEach(e -> System.out.println(e));
        return itemsOfBag;
    }

    public List<String> removeThingsToStack(String thingToRemove) {
        itemsOfBag.remove(thingToRemove);
        return itemsOfBag;
    }
}
