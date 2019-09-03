package Chapter11_InheritanceAndPolymorphism;

public class Test02 {
    public static void main(String[] args) {
        new Person().printPerson();// Person
        new Student().printPerson(); // Person

    }
}
class Person{
    private String getInfo(){
        return "Person";
    }
    public void printPerson(){
        System.out.println(getInfo());
    }
}
class Student extends Person{

    private String getInfo(){
        return "Student";
    }
}