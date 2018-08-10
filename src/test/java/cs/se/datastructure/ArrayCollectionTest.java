package cs.se.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCollectionTest {

    @Test
    public void testSizeZero() {
        ArrayCollection arrayCollection = new ArrayCollection(0);
        assertEquals(0, arrayCollection.size());
    }


}
