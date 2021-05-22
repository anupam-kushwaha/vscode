import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumDistinctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int delete = sc.nextInt();
        Integer[] frequency = new Integer[10];
        ArrayList<Integer> list = new ArrayList<>();
        for (String in : input.split(" ")) {
            Integer num = Integer.parseInt(in);
            list.add(num);
            frequency[num]++;
        }
        Arrays.sort(frequency);
    }
}
