package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
//        this.side = side;
    }

    public int getArea() {
        System.out.println("getArea");
        return (length * length);
    }


    public int getPerimeter() {
        System.out.println("getPerimeter");
        return (4 * length);
    }


}
