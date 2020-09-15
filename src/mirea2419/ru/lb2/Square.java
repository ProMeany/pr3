package mirea2419.ru.lb2;

public class Square extends Rectangle {

    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
    }
    public String toString() {
        return "Square : " + "side = " + side;
    }
}
