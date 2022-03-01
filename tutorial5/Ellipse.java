package tutorial5;

public class Ellipse extends Shape{
    public Ellipse(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area for Ellipse");
        return PI * dim1 * dim2;
    }
}
