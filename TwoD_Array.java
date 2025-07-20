public class TwoD_Array {
    public static void main(String[] args) {

        String[][] groceries = {{"APPLE","MANGO","WATERMELON"},
                                {"POTATO","ONION","CARROT"},
                                {"CHICKEN","BEEF","FISH"}};

        groceries[0][0] = "PINEAPPLE";
        groceries[1][1] = "CUCUMBER";
        groceries[2][1] = "EGG'S";
        groceries[1][2] = "TOMATO";

        for (String[] foods : groceries){
            for (String food : foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }
    }
}
