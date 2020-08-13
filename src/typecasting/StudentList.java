package typecasting;
import java.util.ArrayList;
class Student{
    String name;
    public Student(String name) {
        this.name = name;
    }
}
public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> stdlist=new ArrayList<>();
        stdlist.add(new Student("Ram"));
        stdlist.add(new Student("Sita"));

        for(Student s: stdlist){
            String name=(String)s.name;
            System.out.println(name);
        }
    }
}
