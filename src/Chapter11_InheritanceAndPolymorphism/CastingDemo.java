package Chapter11_InheritanceAndPolymorphism;

public class CastingDemo {
    public static void main(String[] args) {
        //Create and initialize the two objects
        Object o1 = new Circle(1.2); // It's good to define a variable with a supertype, which can accept an object of any subtype,
        Object o2 = new Rectangle(2,3);// and to enable generic programming
        //display circle and rectangle
        displayObject(o1);
        displayObject(o2);
    }
    public static void displayObject(Object object){
        if(object instanceof Circle){
            System.out.println("The circle area is " + ((Circle) object).getArea());
            System.out.println("The circle diameter is " + ((Circle) object).getDiameter());//
        }
        else if(object instanceof Rectangle)
            System.out.println("The rectangle area is " + ((Rectangle) object).getArea());

    }
}
