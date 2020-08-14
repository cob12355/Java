package packagedemo;
import p1.Bank;
import p1.pp.Employee;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank =new Bank();
        bank.bankname="Sanima Bank";
        bank.address="Kumaripati, Lalitpur";

        System.out.println("Bank Name: "+bank.bankname);
        System.out.println("Address: "+bank.address);


        Employee employee=new Employee();
        employee.employeeInfo();
    }
}
