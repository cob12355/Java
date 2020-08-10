package javaapp;

public class ConditionEx {
    public static void main(String[] args) {
     int age[]={10,20,30,40};
//        System.out.println(age[3]);

        for(int i=0; i<=age.length-1;i++){
            System.out.print(age[i]+" ");
        }
        System.out.println("\n=============");
        for (int i:age) {
            System.out.print(i+" ");
        }
    }
}
