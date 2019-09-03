package Chapter11_InheritanceAndPolymorphism;

public class TestInstanceOf {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        GeometricObject object = new GeometricObject();

        System.out.println(circle instanceof GeometricObject);// true
        System.out.println(object instanceof GeometricObject);// true
        System.out.println(circle instanceof  Circle);// true
        System.out.println(object instanceof Circle);// false

        Circle circle1 = new Circle(5);
        GeometricObject object1 = circle1;

        GeometricObject object2 = new GeometricObject();
        Circle circle2 = (Circle)object2;
    }
}
