import java.util.Scanner;
import java.util.ArrayList;

public class Consecutive4NumInMatrix {
    public static boolean areEqual(int a, int b, int c, int d) {
        return (a == b && b == c && c == d && d == a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // case : 1 (row)
                try {
                    if (j < col - 3) {
                        if (areEqual(matrix[i][j], matrix[i][j+1], matrix[i][j+2], matrix[i][j+3])) {
                            answer.add(matrix[i][j]);
                        }
                    }

                    // case : 2 (col)
                    if (i < row - 3) {
                        if (areEqual(matrix[i][j], matrix[i+1][j], matrix[i+2][j], matrix[i+3][j])) {
                            answer.add(matrix[i][j]);
                        }
                    }

                    // case : 3 (left to right diagonal)
                    if (j < col - 3 && i >= 3) {
                        if (areEqual(matrix[i][j], matrix[i-1][j+1], matrix[i-2][j+2], matrix[i-3][j+3])) {
                            answer.add(matrix[i][j]);
                        }
                    }

                    // case : 4 (right to right diagonal)
                    if (j < col - 3) {
                        if (areEqual(matrix[i][j], matrix[i-1][j+1], matrix[i-2][j+2], matrix[i-3][j+3])) {
                            answer.add(matrix[i][j]);
                        }
                    }
                } catch(Exception e) {

                }
            }
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}
