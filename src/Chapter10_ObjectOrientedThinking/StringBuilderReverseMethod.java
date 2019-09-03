package Chapter10_ObjectOrientedThinking;

public class StringBuilderReverseMethod {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcd");
        StringBuilder stringBuilder1 = stringBuilder.reverse();
        System.out.println(stringBuilder1);
    }
}
