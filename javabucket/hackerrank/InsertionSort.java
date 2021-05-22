import java.util.Scanner; 
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] >  value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }    
}
