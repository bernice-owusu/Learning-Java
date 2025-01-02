package objects;

// Write a class that describes the fields and methods of a rectangle.

public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    // Add a default constructor constructor to the Rectangle class
    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    // Add an all-arg constructor to the Rectangle class
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
