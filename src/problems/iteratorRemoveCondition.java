package problems;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorRemoveCondition {
    public static void main(String[] args) {
        ArrayList<Integer > numbers = new ArrayList<>();
        int [] arr =  {12,2,9,13,11,4,6};
        for (int i = 0;i<arr.length;i++){
            numbers.add(arr[i]);
        }
        System.out.println(numbers);

        Iterator<Integer> it = numbers.iterator() ;
        while (it.hasNext()){
            Integer i = it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println("List  after removal : " + numbers);

        }

}
