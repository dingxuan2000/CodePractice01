package Chapter11_InheritanceAndPolymorphism;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        System.out.println(circle.equals(circle1)); // false

        /**
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        System.out.println("-------------------------");
        Rectangle rectangle = new Rectangle(1.0,2.0,"red",true);
        System.out.println("The rectangle " + rectangle.toString());
         */
    }
}
