package HWToLes16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStingCollectionImpl {
    private StringCollection strCollection;
    @BeforeEach
    public void start() {
        strCollection = new StingCollectionImpl();
        strCollection.add("string");
        strCollection.add("another string");
        strCollection.add("one more string");
        strCollection.add("last string");
    }
    @Test
    void testSize(){
        Assertions.assertEquals(4, strCollection.size());
    }

    @Test
    void testAddStr(){
        strCollection.add("second last string");
        Assertions.assertTrue(strCollection.contains("second last string"));
        Assertions.assertEquals(5, strCollection.size());
    }

    @Test
    void testAddByIndex(){
        strCollection.add(2, "new string");
        Assertions.assertEquals(strCollection.get(2), "new string");
        Assertions.assertEquals(5, strCollection.size());
    }

    @Test
    void testGet(){
        Assertions.assertEquals("another string", strCollection.get(1));
    }

    @Test
    void testEquals(){
        StringCollection strCollection2 = new StingCollectionImpl();
        strCollection2.add("string");
        strCollection2.add("another string");
        strCollection2.add("one more string");
        strCollection2.add("last string");
        Assertions.assertTrue(strCollection.equals(strCollection2));
    }

    @Test
    void testContains(){
        Assertions.assertTrue(strCollection.contains("last string"));
    }

    @Test
    void testDelete(){
        strCollection.delete("string");
        Assertions.assertFalse(strCollection.contains("string"));
    }

    @Test
    void testClear(){
        strCollection.clear();
        Assertions.assertEquals(0, strCollection.size());
    }
}
