package Chapter11_InheritanceAndPolymorphism;

public class Overloading {
    public static void main(String[] args) {
        E e = new E();
        e.p(10); //值传入了p(int i)方法，10
        e.p(10.0); //值传入了p(double i)方法，20.0
    }
}
class D {
    public void p(double i){
        System.out.println(i*2);
    }
}
class E extends D {
    public void p(int i){
        System.out.println(i);
    }
}
