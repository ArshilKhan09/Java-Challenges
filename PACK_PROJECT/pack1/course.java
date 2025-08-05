package PACK_PROJECT.pack1;

import java.util.Scanner;

public class course {
        public String courseName;
    public int courseCode;

    public void readCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        courseName = sc.nextLine();
        sc.close();
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
    }

}
