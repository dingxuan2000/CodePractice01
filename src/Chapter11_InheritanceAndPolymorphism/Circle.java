package Chapter11_InheritanceAndPolymorphism;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        /** 可以用super(argument) 来取代setColor and setFilled
        setColor(color); //这里不能用private data fields: color and filled in the GeometricObject class!
        setFilled(filled);//因为private data fields cannot accessed in any class other than in the GeometricObject class.
         */
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle(){
        System.out.println("The circle is created "+ super.getDateCreated() + "and the radius is " + radius);
    }
    public String toString(){
        return super.toString() + "\nradius is " + radius;
    }

    /**
     * Override the equals method in Circle class
     * @param
     * @return
     */
    public boolean equals(Object circle){ //千万不要把parameter list写成 (Circle circle)!!!
        return this.radius == ((Circle)circle).radius;
    }
}
