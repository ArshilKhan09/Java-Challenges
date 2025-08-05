import java.util.Scanner;
import Student.Studentinfo;
import Student.Studentper;

public class Studentmain {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentinfo si = new Studentinfo();
        Studentper sp = new Studentper();

        System.out.print("Enter Roll No: ");
        si.rollno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        si.name = sc.nextLine();

        System.out.print("Enter Class: ");
        si.studentClass = sc.nextLine();

        System.out.print("Enter Marks of English Subject : ");
        int English = sc.nextInt();
        System.out.print("Enter Marks of Maths Subject : ");
        int Maths = sc.nextInt();
        System.out.print("Enter Marks of Science Subject : ");
        int Science = sc.nextInt();

        si.percentage = sp.calculatePercentage(English,Maths,Science);
        si.displayInfo();
        sc.close();
    }
}
