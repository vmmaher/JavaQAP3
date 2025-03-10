public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double calculateArea();
    
    public abstract double calculatePerimeter();
    
    @Override
    public String toString() {
        return "Shape: " + name + " area: " + String.format("%.2f", calculateArea()) + " Perimeter: " + String.format("%.2f", calculatePerimeter());
    }
}