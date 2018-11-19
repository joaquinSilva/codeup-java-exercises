package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
//        this.length = length;
//        this.width = width;
    }

    @Override
    public void setLength(int num) {
        this.length = num;
    }

    @Override
    public void setWidth(int num) {
        this.width = num;
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
