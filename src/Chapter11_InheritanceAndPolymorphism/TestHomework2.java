package Chapter11_InheritanceAndPolymorphism;

public class TestHomework2 {
    public static void main(String[] args) {
        Object people = new People();
        Women woman = (Women)people;

    }
}
class People{

}
class Women extends People{

}
