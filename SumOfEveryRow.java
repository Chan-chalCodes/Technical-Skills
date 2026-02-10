import java.util.Scanner;

public class SumOfEveryRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of rows:");
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
    
}
