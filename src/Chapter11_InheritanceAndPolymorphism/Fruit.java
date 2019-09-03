package Chapter11_InheritanceAndPolymorphism;

public class Fruit {
    public Fruit(){}
}
class Apple extends Fruit{
    public Apple(){}
    public static void makeAppleCider(Object object){
            System.out.println("Make Apple Cider");
    }
}
class Orange extends Fruit{
    public Orange(){}
    public static void makeOrangeJuics(Object object){
        System.out.println("Make Orange Juice");
    }
}
class GoldenDelicious extends Apple{
    public GoldenDelicious(){}
}
class McIntosh extends Apple{
    public McIntosh(){}
}
class TestInstance{
    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange=new Orange();
        Apple.makeAppleCider(fruit);
        //Apple.makeAppleCider(orange); //orange canot invoke this method
        Orange.makeOrangeJuics(orange);
        Orange.makeOrangeJuics(fruit);
        /**
        System.out.println(fruit instanceof Fruit);
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof McIntosh);
        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);
        //System.out.println(orange instanceof Apple); compile error: cannot cast orange to apple
         */

    }
}