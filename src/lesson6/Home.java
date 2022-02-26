package lesson6;

import java.util.Objects;

public class Home {
    public static void main(String[] args) {
        Square square1 = new Square(5, 5, 5, 5);
        int area = square1.area();
        System.out.println("The area of the square is" + " " + square1.area());
        Rectangle rectangle1 = new Rectangle(5, 10, 5, 10);
        System.out.println("The area of the rectangle is" + " " + rectangle1.area());
        Circle circle1 = new Circle(area);
        System.out.println("The area of the circle is" + " " + circle1.area());
        Ellipse ellipse1 = new Ellipse(area);
        System.out.println("The area of the ellipse is" + " " + ellipse1.area());
        Triangle triangle1 = new Triangle(5,5,5);
        System.out.println("The area of the triangle is" + " " + triangle1.area());
        RightTriangle rightTriangle1 = new RightTriangle(10,10,10);
        System.out.println("The area of the right triangle is" + " " + rightTriangle1.area());





    }

}

class Square{
    private int a;
    private int b;
    private int c;
    private int d;

    public Square(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a == square.a && b == square.b && c == square.c && d == square.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public void setD(int d) {
        this.d = d;
    }
    public int area(){
        return a + b + c + d;
    }
}

class Rectangle extends Square{
    private int a;
    private int b;
    private int c;
    private int d;

    public Rectangle(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getC() {
        return c;
    }

    @Override
    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int getD() {
        return d;
    }

    @Override
    public void setD(int d) {
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b && c == rectangle.c && d == rectangle.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b, c, d);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}

class Circle{
    private int radius = 5;

    public Circle(int radius) {
    }

    public int getRadius() {
        return radius;
    }

    public int setRadius(int radius) {
        this.radius = radius;
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    public int area(){
        return (int)(2 * Math.PI * radius);
    }

}

class Ellipse extends Circle{
    private int radius = 15;

    public Ellipse(int radius) {
        super(radius);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ellipse ellipse = (Ellipse) o;
        return radius == ellipse.radius;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public int area() {
        this.radius = radius;
        return (int)(2 * Math.PI * radius) ;
    }

}


class Triangle{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int area() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}

class RightTriangle{
    private int a;
    private int b;
    private int c;

    public RightTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int area() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightTriangle that = (RightTriangle) o;
        return a == that.a && b == that.b && c == that.c;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
