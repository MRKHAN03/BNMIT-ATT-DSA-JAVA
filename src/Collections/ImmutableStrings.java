package Collections;

public class ImmutableStrings {
    public static void main(String[] args) {
        String name = "MUSTKIM";
        System.out.println("Lower case:"+ name.toLowerCase());
        System.out.println("Original: "+name);


        StringBuffer s = new StringBuffer("JAVA");
        System.out.println("original string:" + s);
        s.reverse();
        System.out.println("Reversed:"+ s);
    }

}
