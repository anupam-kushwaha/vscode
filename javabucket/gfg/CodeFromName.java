import java.util.*;

public class CodeFromName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> codes = new ArrayList<>();

        for (String nameCode : input.split(",")) {
            String[] inner = nameCode.split(":");
            names.add(inner[0]);
            codes.add(inner[1]);
        }
        String output = "";
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String code = codes.get(i);
            int index = findMaxNumber(code, name.length());
            output += (index == 0) ? "X" : name.charAt(index - 1);
        }

        System.out.println(output);
        sc.close();
    }

    public static int findMaxNumber(String code, int len) {
        int max = 0;
        for (String s : code.split("")) {
            int num = Integer.parseInt(s);
            if (num <= len && num > max) {
                max = num;
            }
        }
        return max;
    }
}