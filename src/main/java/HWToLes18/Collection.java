package HWToLes18;

import java.util.List;
import java.util.stream.Collectors;

public class Collection {

    public Collection(){}

    public static double findAverage(List<Integer> collection){
        return collection.stream().mapToDouble(Integer::doubleValue).average().orElseThrow(IllegalArgumentException::new);
    }

    public static List<String> filterString(List<String> collection){
        return collection.stream().filter(string ->string.matches("[AEOUIYaeouiy].*")).map(String :: toUpperCase).collect(Collectors.toList());
    }

    public static List<String> filterLoverCase(List<String> collection){
        return collection.stream().filter(string ->string.equals(string.toLowerCase()) && string.length()==4).collect(Collectors.toList());
    }
}
