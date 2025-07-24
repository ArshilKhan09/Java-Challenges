public class STUDENT {

    // Class variables(properties of the student)
    String name;
    int age;
    double sgpa;
    boolean isstudent;

    // Method to set data and print it
    public void setStudentDetails(String name, int age, double sgpa, boolean isstudent) {
        this.name = name;
        this.age = age;
        this.sgpa = sgpa;
        this.isstudent = isstudent;

        // For Printing student details
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sgpa);
        System.out.println(this.isstudent);
        System.out.println();
    }

    public static void main(String[] args) {
        // Created only 1 object
        STUDENT student = new STUDENT();

        // Reused the same object to print different student details
        student.setStudentDetails("Arshil", 20, 6.91, true);
        student.setStudentDetails("Rehan", 19, 7.65, true);
        student.setStudentDetails("Mustakim", 22, 8.73, false);
        student.setStudentDetails("Farhan", 20, 7.11, true);
    }
}
