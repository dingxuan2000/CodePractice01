package Chapter10_ObjectOrientedThinking;

public class StringBuilderAppendMethod {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s,builder);

        System.out.println(s);
        System.out.println(builder);
    }
    public static void change(String s, StringBuilder builder){
        s = s + " and HTML";// Java
        builder.append(" and HTML");// Java and HTML
    }
}
