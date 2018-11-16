package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());


//        Rectangle box2 = new Square(5);
////
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(((Square) myShape).getWidth());
        myShape = new Rectangle(5, 4);
        System.out.println(myShape.getPerimeter());
        System.out.println(((Rectangle) myShape).getLength());
        System.out.println(myShape.getArea());



    }


}
