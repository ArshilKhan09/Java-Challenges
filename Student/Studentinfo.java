package Student;

public class Studentinfo {
    public int rollno;
    public String name;
    public String studentClass;
    public double percentage;

    public void displayInfo() {
        System.out.println("----- Student Information -----");
        System.out.println("Roll No     : " + rollno);
        System.out.println("Name        : " + name);
        System.out.println("Class       : " + studentClass);
        System.out.println("Percentage  : " + percentage + "%");
    }
}
