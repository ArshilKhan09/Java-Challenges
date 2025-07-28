 class Demo {
    int id ;
    String name ;
    
    public void display(){
    System.out.println("Employee Id : "+id);
    System.out.println("Employee Name : "+name);
    }
}
public class Main {
public static void main(String[] args) {
    Demo ep[] = new Demo[5];

    for (int i = 0; i < ep.length; i++) {
            ep[i] = new Demo();
        }

    ep[0].id = 1 ;
    ep[1].id = 2;
    ep[2].id = 3;
    ep[3].id = 4;
    ep[4].id = 5;

    ep[0].name = "Abuzar";
    ep[1].name = "Siddiq";
    ep[2].name = "Maaz";
    ep[3].name = "Farhan";
    ep[4].name = "Aniket";

    for (int i = 0 ; i < ep.length ; i++) {
        ep[i].display();
    }
 }
}