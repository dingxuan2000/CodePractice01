package Chapter10_ObjectOrientedThinking;

public class StringBuilderDeleteMethod {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcdefg");
        System.out.println(stringBuilder.delete(1,6)); //ag
    }
}
