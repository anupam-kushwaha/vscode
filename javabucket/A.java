import java.net.SocketPermission;

public class A{
    public static void main(String [] args) {
        String name = "Max";
        String newName = "Max";
        newName = newName+"aaaa";
        System.out.println(name);
        System.out.println(newName);
        
        int [][] arr = {{1, 2, 3}, {1, 3}};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}