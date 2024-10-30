public class Sguare extends Shape {
    private double side;

    public Sguare(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Sguare{" +
                "side: " + side +
                '}';
    }
}