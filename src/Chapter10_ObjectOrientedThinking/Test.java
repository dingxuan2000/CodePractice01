package Chapter10_ObjectOrientedThinking;

public class Test {
    public static void main(String[] args) {
        String s1 ="Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3="Welcome to Java";

        System.out.println("s1==s2 is "+ (s1==s2)); //false
        System.out.println("s1==s3 is "+ (s1==s3)); //true
        System.out.println("Welcome".replace('e','E'));

        // split method in String class
        String[] list="Java#HTML#CSS".split("#");
        for (String a: list) {
            System.out.print(a+" ");

        }
        String[] tokens="Java,C?C#,C++".split("[.,:;?]");
        for (String a:tokens) {
            System.out.println(a);
        }

        // Matching, replacing, splitting methods in String class
        System.out.println("Java is fun".matches("Java.*"));//true
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}")); //true
        String s = "a&b*c!".replaceAll("[&*!]", "dd");
        System.out.println(s);

    }
}
