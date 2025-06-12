package Basics.PatternMatching;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatching {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("core java" , 2);
        Matcher matcher = pattern.matcher("We are learning CORE JAVA");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if(matchFound){
            System.out.println("Correct match");
        }
        else {
            System.out.println("Data Mismatched");
        }
    }
}
