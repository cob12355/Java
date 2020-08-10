package javaapp;

public class Animal {
    String name;
    int age;
    public void eat(){
        System.out.println("eating someting...");
    }

    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.name="Ketty Cat";
        cat.age=2;

        System.out.println("Animal's Name: "+cat.name);
        System.out.println("Animal's Age: "+cat.age);
        System.out.print(cat.name+ " ");
        cat.eat();
    }
}
