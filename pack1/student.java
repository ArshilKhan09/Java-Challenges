package pack1;

import java.util.Scanner;

public class Student {
    public String name;
    public int rollNo;

    public void readStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}
