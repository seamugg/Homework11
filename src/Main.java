import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

       int[] arraylist = {-2, -3, 6, 3};
        int[] arraylist2 = {-2, -4, 5, -3};


        ArrayList<int[]> arraylist3= new ArrayList<int[]>();

        arraylist3.add(arraylist);
        arraylist3.add(arraylist2);


        System.out.println("The list 3 is  " + Collections.min(arraylist3));


    }
}