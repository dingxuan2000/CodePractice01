package Chapter11_InheritanceAndPolymorphism;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
        /** 可以用super(argument)来取代setColor and setFilled
        setColor(color);
        setFilled(filled);
        */
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double newWidth){
        this.width = newWidth;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}
