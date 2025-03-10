public class EquilateralTriangle extends Triangle {
    private double side;
    
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }
    
    @Override
    public void scale(double factor) {
        this.side *= factor;
        super.scale(factor);
    }
}