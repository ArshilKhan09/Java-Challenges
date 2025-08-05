package pack2;
import pack1.student;
import pack1.course;

public class college {
     public void accept() {
        student s = new student();
        course c = new course();
  
        s.readStudent();
        c.readCourse();

        System.out.println("\n--- Displaying Information ---");
        s.displayStudent();
        c.displayCourse();
    }
}
