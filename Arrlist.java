import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);   // autoboxing
        list.add(20);
        list.add(30);

        System.out.println(list);

        int x = list.get(0);   // auto-unboxing
        System.out.println(x);
    }
}