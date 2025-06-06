package Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        String [] duplicateData = {"Java" , "Python" , "Python" ,"C++" , "C++" , "SQL" , "MySQL" ,"MySQL","MySQL"};
        System.out.println("Before removing duplicates : " + Arrays.toString(duplicateData));
        Set<String> uniqueData = new LinkedHashSet<>();
        for(String str : duplicateData){
            uniqueData.add(str);
        }
        System.out.println("After removing duplicates : " + uniqueData);
        uniqueData.forEach(i-> System.out.print(i  + " "));

    }

}
