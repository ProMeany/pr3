package mirea2419.ru.lb2;

public class Main {

    public static void main(String[] args) {

        Shape sap1 = new Circle(5.5, "RED", false);
        System.out.println(sap1);
        System.out.println(sap1.getArea());
        System.out.println(sap1.getPerimeter());
        System.out.println(sap1.getColor());
        System.out.println(sap1.isFilled());

        Circle cir1 = (Circle)sap1;
        System.out.println(cir1);
        System.out.println(cir1.getArea());
        System.out.println(cir1.getPerimeter());
        System.out.println(cir1.getColor());
        System.out.println(cir1.isFilled());
        System.out.println(cir1.getRadius());


        Shape sap2  = new Rectangle(1.0, 2.0, "Red", false);
        System.out.println(sap2);
        System.out.println(sap2.getArea());
        System.out.println(sap2.getPerimeter());
        System.out.println(sap2.getColor());

        Rectangle rec1 = (Rectangle)sap2; // downcast
        System.out.println(rec1);
        System.out.println(rec1.getArea());
        System.out.println(rec1.getColor());
        System.out.println(rec1.getLength());

        Shape sap3 = new Square(6.6); // Upcast
        System.out.println(sap3);
        System.out.println(sap3.getArea());
        System.out.println(sap3.getColor());

        Rectangle rec2 = (Rectangle)sap3;
        System.out.println(rec2);
        System.out.println(rec2.getArea());
        System.out.println(rec2.getColor());
        System.out.println(rec2.getLength());

        Square sq1 = (Square)rec2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        MovablePoint movablePoint = new MovablePoint(0, 0, 3, 2);

        movablePoint.moveRight();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);


    }
}
