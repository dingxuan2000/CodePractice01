package Chapter11_InheritanceAndPolymorphism;

public class GeometricObject {
    protected String color = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date(); //very important!!
    }
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date(); //very important!!
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean newFilled){
        this.filled = newFilled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + "\nand filled: " + filled;
    }

}
