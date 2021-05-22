import java.util.*;

public class NameCodeSquare {

    public static int findSquareSum(String code) {
        int res = 0;
        for (String s : code.split("")) {
            int num = Integer.parseInt(s);
            res += num * num;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> codes = new ArrayList<>();
        
        for (String str : input.split(",")) {
            String[] inner = str.split(":");
            names.add(inner[0]);
            codes.add(inner[1]);
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            StringBuilder sb = new StringBuilder(names.get(i));
            String code = codes.get(i);
            int sqrSumOfCode = findSquareSum(code);
            if (sqrSumOfCode % 2 == 0) {
                sb = sb.insert(0, sb.substring(sb.length() - 2));
                sb = sb.delete(sb.length() - 2, sb.length());
                ans.add(sb.toString());
            } else {
                sb = sb.append(sb.charAt(0));
                sb = sb.deleteCharAt(0);
                ans.add(sb.toString());
            }
        }
        for (String s : ans) {
            System.out.print(s +" ");
        }
    }
}
