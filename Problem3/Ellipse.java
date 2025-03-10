public class Ellipse extends Shape {
    protected double a;
    protected double b;
    
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }
    
    @Override
    public double calculatePerimeter() {
        return Math.PI * Math.sqrt(2 * (a*a + b*b) - Math.pow(a-b, 2)/2);
    }
}