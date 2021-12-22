package HWToLes18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
    @Test
    public void testFindAverage(){
        List<Integer> collection = new ArrayList<>();
        int size = 5;
        double variable = 0.0;
        for (int i = 0; i < size; i++) {
            collection.add(i+2);
            variable += (i+2);
        }
        double average = variable/size;
        double average2 = Collection.findAverage(collection);
        Assertions.assertEquals(average, average2);
    }

    @Test
    public void testFilterString(){
        List<String> collection = new ArrayList<>();
        collection.add("climate");
        collection.add("accident");
        collection.add("attraction");
        collection.add("atmosphere");
        List<String> result = Collection.filterString(collection);

        List<String> collection2 = new ArrayList<>();
        collection2.add("ACCIDENT");
        collection2.add("ATTRACTION");
        collection2.add("ATMOSPHERE");
        Assertions.assertEquals(collection2, result);
    }

    @Test
    public void testFilterLoverCase(){
        List<String> collection = new ArrayList<>();
        collection.add("mask");
        collection.add("DUST");
        collection.add("song");
        collection.add("actor");
        List<String> result = Collection.filterLoverCase(collection);

        List<String> collection2 = new ArrayList<>();
        collection2.add("mask");
        collection2.add("song");
        Assertions.assertEquals(collection2,result);
    }
}
