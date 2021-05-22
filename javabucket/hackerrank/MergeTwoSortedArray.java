import java.util.Scanner;

public class MergeTwoSortedArray {
    
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        
        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            int j = 0;
            while (j < n - 1 && arr2[j] > arr2[j + 1]) {
                int temp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = temp;
                j++;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[M];
        
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        
        merge(arr1, arr2);
        
        for (int i = 0; i < N; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int j = 0; j < M; j++) {
            System.out.print(arr2[j] +" ");
        }
        
    }
}