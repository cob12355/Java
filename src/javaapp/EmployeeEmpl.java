package javaapp;

public class EmployeeEmpl {
    int n;
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.info();

        new Employee().info();


        int maxAge=e1.getMaxEmpAge();
        System.out.println("Maximum employee age is: "+maxAge);

    }
}
