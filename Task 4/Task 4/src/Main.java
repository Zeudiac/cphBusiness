public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        Square s1 = new Square(8);
        ShapeBuilder SB = new ShapeBuilder();

        System.out.println(c1.getArea());
        System.out.println(s1.getArea());
        SB.addShape(c1);
        SB.addShape(s1);

        System.out.println(SB.getTotalArea());
    }
}