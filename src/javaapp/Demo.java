package javaapp;

public class Demo {
    public Demo(){
        System.out.println("Demo class is created");
    }
    public Demo(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
//        new Demo();
        new Demo("hello world");
    }
}
