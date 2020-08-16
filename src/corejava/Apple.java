package corejava;

import inheritance.A;

public class Apple extends Mobile {
    @Override
    public void info() {
        System.out.println("showing apple information");
    }

    public static void main(String[] args) {
        Apple iphone5=new Apple();
        iphone5.info();
    }
}
