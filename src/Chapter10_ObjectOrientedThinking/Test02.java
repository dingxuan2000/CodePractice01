package Chapter10_ObjectOrientedThinking;

public class Test02 {
    public static void main(String[] args) {
        String s1= "Welcome";
        String s2 ="welcome";
        //s2 = s1.replaceAll("e","E");
        //System.out.println(s2);

        String[] list="Welcome to Java and HTML".split(" ");
        for(String a:list)
            System.out.print(a+" ");
        //How to assign the first two tokens into s1 and s2?

    }
}
