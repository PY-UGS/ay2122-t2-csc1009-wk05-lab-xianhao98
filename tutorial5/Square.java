package tutorial5;

public class Square extends Shape{
    public Square(double length1, double length2){
        super(length1, length2);
    }

    double area(){
        System.out.println("Inside Area for Square");
        return dim1 * dim2;
    }
}
