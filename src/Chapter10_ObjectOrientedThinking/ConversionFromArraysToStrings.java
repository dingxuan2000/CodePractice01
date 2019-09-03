package Chapter10_ObjectOrientedThinking;

public class ConversionFromArraysToStrings {
    public static void main(String[] args) {
        String str1= new String(new char[]{'J','A','V','A'});
        System.out.println(str1);
        String str2 = String.valueOf(new char[]{'J','A','V','A'});
        System.out.println(str2);
    }
}
