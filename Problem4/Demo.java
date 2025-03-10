public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Ellipse("Ellipse", 5, 3);
        shapes[1] = new Circle("Circle", 3);
        shapes[2] = new Triangle("Triangle", 3, 6, 5);
        shapes[3] = new EquilateralTriangle("Equilateral triangle", 9);
        
        System.out.println("original shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
        
        double scaleFactor = 2.0;
        System.out.println("after scaling:");
        scaleShapes((Scalable[])shapes, scaleFactor);
        
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
    }
    
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}