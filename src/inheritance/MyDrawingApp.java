package inheritance;
class Shape{
    public Shape(String name){
        System.out.println("Drawing shape "+name);
    }
}
public class MyDrawingApp extends Shape{
    public MyDrawingApp(String shapeName){
        super(shapeName); //to instantiate parent class constructor
        System.out.println("Drawing app is ready to draw some shape.");

    }

    public static void main(String[] args) {

        new MyDrawingApp("Ovel");

    }
}
