import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StackTest {

    private List<String> testItems = new ArrayList<>();

    private List<String> randomizeTest(List<String> testItems) {
        Collections.shuffle(testItems);
        return testItems;
    }

    @Test
    public void shouldBeRandomized() {
        Stack testStack = new Stack();
        StackTest testTest = new StackTest();
        assertEquals(testStack.randomizeItemsIntoStack(testItems), testTest.randomizeTest(testItems));
    }
}