package inheritance;

public class B extends A {
    int b;

    public static void main(String[] args) {
        B ob=new B();
        ob.b=10;
        ob.a=5;

        System.out.println("Total sum: "+(ob.a+ob.b));
    }
}
