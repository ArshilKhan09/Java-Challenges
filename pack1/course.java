package pack1;

import java.util.Scanner;

public class Course {
    public String courseName;
    public int courseCode;

    public void readCourse(Scanner sc) {
        System.out.print("Enter Course Name: ");
        courseName = sc.next();
        sc.nextLine();
        
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
    }

}
