package mirea2419.ru.lb2;

public class Circle extends Shape {

    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "blue";
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return 0;
    }


    public double getPerimeter() {
        return 0;
    }


    public String toString() {
        return "Circle: " +
                "radius = " + radius;
    }
}
