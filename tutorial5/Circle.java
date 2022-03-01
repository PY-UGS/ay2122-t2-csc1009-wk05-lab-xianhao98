package tutorial5;

public class Circle extends Shape{
    public Circle(double radius1, double radius2){
        super(radius1,radius2);
    }
    double area(){
        System.out.println("Inside Area for Circle");
        return PI * dim1 * dim2;
    }
}
