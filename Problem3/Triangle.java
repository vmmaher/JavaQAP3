public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;
    
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error with the triangle sides.");
            System.exit(1);
        }
    }
    
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}