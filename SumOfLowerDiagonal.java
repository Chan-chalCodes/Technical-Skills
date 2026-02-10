import java.util.Scanner;

public class SumOfLowerDiagonal {
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
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i > j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Lower diagonal: "+sum);
    }
}
