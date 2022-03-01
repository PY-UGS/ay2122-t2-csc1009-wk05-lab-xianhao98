package tutorial5;

public class Triangle extends Shape{

    public Triangle(double base, double height){
        super(base,height);
        
    }

    double area(){
        System.out.println("Inside Area for Triangle");
        return 0.5 * dim1 * dim2;
    }
}
