package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public int getArea() {
        return length * width;
    }


    public int getPerimeter() {
        return (length*2) + (width*2);
    }
}
