public class ProductArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int n = arr.length;
        int prodArr[] = new int[n];
        int prod = 1;
        for(int i = 0; i < n; i++){
            prod *= arr[i];
        }
        for(int i = 0; i < n; i++){
            prodArr[i] = prod/arr[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(prodArr[i]);
        }


    }
}
