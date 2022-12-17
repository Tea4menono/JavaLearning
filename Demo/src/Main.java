import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr = {1, 2, 3};

        System.out.println(al);
        al.add(1);
        al.add(2);
        al.add(3);
        al.remove(1);
        System.out.println(al);

    }
}