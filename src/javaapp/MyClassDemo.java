package javaapp;

class A{
    void showInfo(){
        System.out.println("showing something");
    }
}

public class MyClassDemo {
    public static void main(String[] args) {
        A obj=new A(); //initialization object
        obj.showInfo();
    }
}
