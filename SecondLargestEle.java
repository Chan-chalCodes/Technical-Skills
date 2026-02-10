import java.util.Scanner;
public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secondMax = 0;
        for(int i = 0; i <n ; i++){
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest: "+ secondMax);

    }
}
