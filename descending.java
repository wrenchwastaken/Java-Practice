import java.util.*;
class descending {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements Of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements in Descending Order");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}