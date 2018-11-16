package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int setLength(int num) {
        return this.length = num;
    }

    @Override
    public int setWidth(int num) {
        return this.width = num;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
