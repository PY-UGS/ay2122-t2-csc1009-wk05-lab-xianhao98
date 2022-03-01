package tutorial5;

 public abstract class Shape {
    double dim1;
    double dim2;
    double PI;

    public Shape(double dim1, double dim2){
        this.PI = Math.PI;
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
