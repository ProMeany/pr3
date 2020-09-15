package mirea2419.ru.lb2;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return 0;
    }


    public double getPerimeter() {
        return 0;
    }


    public String toString() {
        return "Rectangle : "+"width = " + width + ", length = " + length;
    }
}
