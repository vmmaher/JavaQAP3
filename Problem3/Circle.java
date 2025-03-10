public class Circle extends Ellipse {
    private double radius;
    
    public Circle(String name, double radius) {
        super(name, radius, radius);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}