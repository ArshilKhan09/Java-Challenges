package pack2;
import pack1.Student;
import pack1.Course;
import java.util.Scanner;

public class College {
     public void accept() {

      Scanner sc = new Scanner(System.in);
        Student s = new Student();
        Course c = new Course();
  
        s.readStudent(sc);
        c.readCourse(sc);

        System.out.println("\n--- Displaying Information ---");
        s.displayStudent();
        c.displayCourse();

        sc.close();
    }

    public static void main(String[] args) {
      College clg = new College();
        clg.accept();
        
    }
}
