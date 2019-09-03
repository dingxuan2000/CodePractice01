package Chapter11_InheritanceAndPolymorphism;
/**
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());// Students
        m(new Student());// Students
        m(new Person());// Person
        m(new Object());// java.lang.Object@72ea2f77

    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}

class Person extends Object{
    public String toString(){
        return "Person";
    }
}
class Student extends Person{
    @Override
    public String toString(){
        return "Students";
    }
}
class GraduateStudent extends Student{

}
*/