package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNo = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println("Original List :"+numbers);
        System.out.println("New List of Even Numbers: " +evenNo);
    }
}
