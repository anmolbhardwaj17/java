import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(46544);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);

        list.remove(0);
        System.out.println(list.get(0));

        System.out.println(list);

    }
}
