import java.util.*;

public class PronicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	    Set<Integer> set = new HashSet<>();

		for(int i = 0; i < str.length(); i++) {
		    for(int j = i; j < str.length(); j++) {
		        Integer substr = Integer.parseInt(str.substring(i, j + 1));
		        set.add(substr);
		    }
		}
		ArrayList<Integer> list = new ArrayList<>(set);
		ArrayList<Integer> outList = new ArrayList<>();
		Collections.sort(list);
        
        for(Integer n : list) {
            for(int i = 1; i < Math.sqrt(n) + 1; i++) {
                if(i * (i + 1) == n) {
                    outList.add(n);
                    break;
                }
            }
        }
        System.out.println(outList);
        sc.close();
	}
}
