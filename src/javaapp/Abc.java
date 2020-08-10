package javaapp;

public class Abc {
    private int n;
    public int getValue(int n){
        this.n=n;
        return this.n;
    }

    public static void main(String[] args) {
        Abc a=new Abc();
        a.getValue(5);
        System.out.println("Value is: "+a.n);
    }
}
