package Chapter10_ObjectOrientedThinking;

public class CharacterMethods {
    public static void main(String[] args) {
        System.out.println(m("Hi, Good Morning")); //3个uppercase
    }
    public static int m(String s){
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }
}
