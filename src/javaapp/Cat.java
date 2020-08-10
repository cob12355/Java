package javaapp;

public class Cat {
    public Cat(){
        System.out.println("Cat object is created.");
    }
    public Cat(String action){
        this();
        System.out.println("Cat is "+action);
    }

    public static void main(String[] args) {
        new Cat("Sleeping");
    }
}
