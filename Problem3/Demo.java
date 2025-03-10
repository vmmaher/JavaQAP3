public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Ellipse("Ellipse", 5, 3);
        shapes[1] = new Circle("Circle", 3);
        shapes[2] = new Triangle("Triangle", 3, 6, 5);
        shapes[3] = new EquilateralTriangle("Equilateral triangle", 9);
        
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
    }
}