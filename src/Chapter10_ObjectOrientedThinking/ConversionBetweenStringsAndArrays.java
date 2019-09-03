package Chapter10_ObjectOrientedThinking;

public class ConversionBetweenStringsAndArrays {
    public static void main(String[] args) {
        /**
        //Convert a String to an array
        char[] chars="Java".toCharArray();
        for(char a:chars)
            System.out.print(a+" ");
        System.out.println();
        char[] dst={'J','A','V','A','1','3','0','1'};
        "CS3720".getChars(2,5,dst,4);
        for(char b:dst)
            System.out.print(b+" ");
        */
        //Convert an array to Strings
        String str1 = new String(new char[]{'J','A','V','A'});
        System.out.println(str1);
        String str2= String.valueOf(new char[]{'J','A','V','A'});
        System.out.println(str2);
    }
}
