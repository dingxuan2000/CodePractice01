package Chapter11_InheritanceAndPolymorphism;

public class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.p(10.0); // 10.0
        b.p(10); // 10.0

        A a = new A();
        a.p(20.0);

    }
}
class A{
    public void p(double i){
        System.out.println(i*2);
    }
}
class B extends A{
    @Override
    public void p(double i){
        System.out.println(i);
    }
}
