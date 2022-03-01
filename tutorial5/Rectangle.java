package tutorial5;

public class Rectangle extends Shape{

    public Rectangle(double width, double height){
        super(height,width);
        
    }

    double area(){
        System.out.println("Inside Area for Rectangle");
       return dim1 * dim2;
    }
}
