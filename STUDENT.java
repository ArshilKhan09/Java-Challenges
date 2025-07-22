public class STUDENT {

    //This are the Class Variable
    String name ;
    int age ;
    double sgpa ;
    boolean isstudent = true ;
    public static void main(String[] args) {

        Student1obj();
        Student2obj();
        Student3obj();
        Student4obj();
        
    
    }

    //This is an Method
    public static void Student1obj(){
        // Inside the Method a New Object has been Created
        // We can Create Multiple Object For a Class Variable
     STUDENT student = new STUDENT();
       System.out.println( student.name = "Arshil");
       System.out.println( student.age = 20 );
       System.out.println( student.sgpa = 6.91 );
       System.out.println(student.isstudent = true );
       System.out.println();
    }

     public static void Student2obj(){
        // Inside the Method a New Object has been Created
        // We can Create Multiple Object For a Class Variable
     STUDENT student = new STUDENT();
       System.out.println( student.name = "Rehan");
       System.out.println( student.age = 19 );
       System.out.println( student.sgpa = 7.65 );
       System.out.println(student.isstudent = true );
       System.out.println();
    }

     public static void Student3obj(){
        // Inside the Method a New Object has been Created
        // We can Create Multiple Object For a Class Variable
     STUDENT student = new STUDENT();
       System.out.println( student.name = "Mustakim");
       System.out.println( student.age = 22 );
       System.out.println( student.sgpa = 8.73 );
       System.out.println(student.isstudent = false );
       System.out.println();
    }

     public static void Student4obj(){
        // Inside the Method a New Object has been Created
        // We can Create Multiple Object For a Class Variable
     STUDENT student = new STUDENT();
       System.out.println( student.name = "Farhan");
       System.out.println( student.age = 20 );
       System.out.println( student.sgpa = 7.11 );
       System.out.println(student.isstudent = true );
       System.out.println();
    }
}
