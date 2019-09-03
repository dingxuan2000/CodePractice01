package Chapter11_InheritanceAndPolymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Circle c = new Circle(1, "red", false);
        displayObject(c);
        displayObject(new Rectangle(1,1,"black", true));
    }
    public static void displayObject(GeometricObject object){
        System.out.println("Created on "+ object.getDateCreated() + "\nColor is " + object.getColor());
    }
}
