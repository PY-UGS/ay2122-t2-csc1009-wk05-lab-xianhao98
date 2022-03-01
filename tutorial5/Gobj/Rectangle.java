package tutorial5.Gobj;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height= height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }
}
