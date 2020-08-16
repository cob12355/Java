package interfacedemo;

public class MyCanvas implements Shape,Circle {
    @Override
    public void draw() {
        System.out.println("drawing new scene.");
    }

    public static void main(String[] args) {
        MyCanvas canvas=new MyCanvas();
        canvas.draw();
        canvas.drawCircle();
    }

    @Override
    public void drawCircle() {
        System.out.println("drawing red circle");
    }
}
