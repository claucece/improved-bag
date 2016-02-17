import java.util.*;

public class Stack {

    public List<String> randomizeItemsIntoStack(List<String> itemsOfBag) {
        Collections.shuffle(itemsOfBag);
        return itemsOfBag;
    }

    public String popElementOut(List<String> itemsOfBag) {
        String element = itemsOfBag.get(0);
        return element;
    }
    //public String getElementsFromRandomList(List<String> itemsOfBag) {
    //    randomizeStack(itemsOfBag);
    //    itemsOfBag.stream()
    //            .filter(e -> {
    //                if (itemsOfBag.size() == 1) {
    //                    System.out.println(e);
    //                   return false;
    //               } else {
    //                   return true;
    //               }
    //           })
    //           .findAny();
    //   return e;
    //}

    //public Queue<String> sortList(Queue<String> queueOfBag, List<String> itemsOfBag){
    //    randomizeStack(itemsOfBag);
    //    while (!queueOfBag.isEmpty())
    //        itemsOfBag.add(queueOfBag.remove());
    //    return queueOfBag;
    //}
}
