package Chapter11_InheritanceAndPolymorphism;

public class TestCircle {
    private double radius;
    public TestCircle(){}
    public TestCircle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
}
class Graph extends TestCircle{
    private double length;
    Graph(double radius, double length){
        setRadius(radius);
        this.length = length;
    }
    @Override
    public double getArea(){
        return super.getArea()*length;
    }
}
class TestRun{
    public static void main(String[] args) {
        Graph graph = new Graph(1.0, 2.0);
        System.out.println(graph.getArea());
    }
}
