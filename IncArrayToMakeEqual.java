public class IncArrayToMakeEqual {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3};
        int n = arr.length;
        int maxi = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        int time = 0;
        for(int i = 0; i < n ; i++){
            time+= maxi - arr[i];
        }
        System.out.println(time);

    }
}
