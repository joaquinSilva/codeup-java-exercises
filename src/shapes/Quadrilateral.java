package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int num1, int num2) {
        length = num1;
        width = num2;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract int setLength();
    public abstract int setWidth();

}
