package javaapp;

public class DrawingShape {
    public static void main(String[] args) {
        System.out.println(Shape.name);

        Shape.draw("Rectangle");

        Shape c=new Shape();
        c.type="circle";
        System.out.println(c.type);
    }
}
