import junit.framework.TestResult;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BagTest {

    private Stack testStack = new Stack();
    private String size = "big";
    private String color = "brow";
    private List<String> testItemsOfBag = new ArrayList<>();
    private Bag testBag;

    @Before
    public void setUp() {
        testBag = new Bag(size, color, testItemsOfBag);
    }

    @Test
    public void shouldHaveConstructor() {
        String testSize = null;
        try {
            Bag testNewBag = new Bag(testSize, color, testItemsOfBag);
            fail();
        } catch (NullPointerException expected) {

        }
    }

    @Test
    public void shouldHaveSize() {
        assertTrue(testBag.getSize().equals(size));
        assertEquals(size, size);
    }

    @Test
    public void shouldHaveColor() {
        assertTrue(testBag.getColor().equals(color));
        assertEquals(color, color);
    }

    @Test
    public void shouldHaveOneRing() {
        testBag.addOneRing();
        assertTrue(testItemsOfBag.contains("One Ring"));
    }

    @Test
    public void shouldBeAbleToAddThings() {
        testBag.addThingsToStack("Phial of Galadriel");
        assertTrue(testItemsOfBag.contains("Phial of Galadriel"));
    }

    @Test
    public void shouldBeAbleToHaveASizeDependingOnNumberOfElements() {
        testBag.addThingsToStack("Phial of Galadriel");
        testBag.addThingsToStack("Lemba");
        assertTrue(testItemsOfBag.size() == 2);
    }

    @Test
    public void shouldVaryInSize() {
        testBag.addThingsToStack("Phial of Galadriel");
        assertTrue(testItemsOfBag.size() == 1);
        testBag.addThingsToStack("Lemba");
        assertTrue(testItemsOfBag.size() == 2);
    }

    @Test
    public void shouldHaveStack() {
        testBag.addThingsToStack("Phial of Galadriel");
        assertTrue(testBag.setStack(testStack).equals(testStack));
    }

    @Test
    public void shouldPrintAllElements() {
        testBag.addThingsToStack("Phial of Galadriel");
        assertEquals(testBag.printCurrentStack(), testItemsOfBag);
    }

    @Test
    public void shouldBeAbleToRemoveElement() {
        testBag.addThingsToStack("Phial of Galadriel");
        testBag.addThingsToStack("Lemba");
        testBag.removeThingsToStack("Phial of Galadriel");
        assertTrue(testItemsOfBag.size() == 1);
    }

    @Test
    public void shouldBeAbleToMakeStackEmpty() {
        testBag.addThingsToStack("Phial of Galadriel");
        testBag.removeThingsToStack("Phial of Galadriel");
        assertTrue(testItemsOfBag.isEmpty());
    }

    @Test
    public void shouldBeAbleToPopOutElement() {
        testBag.addOneRing();
        Stack testStack = new Stack();
        testStack.popElementOut(testItemsOfBag);
        assertEquals(testStack.popElementOut(testItemsOfBag), "One Ring");
    }
}