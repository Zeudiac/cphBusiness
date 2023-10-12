public class Circle implements Shape{
    double r;
    public Circle(double r){
    this.r=r;
    }
    @Override
    public double getArea() {
        double area=3.14 * (this.r * this.r);
        return area;
    }
}
