public class Square implements Shape{
    double l;
    public Square(double l){
        this.l=l;
    }

    @Override
    public double getArea() {
        double area=l*l;
        return area;
    }

}
