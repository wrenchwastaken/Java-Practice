import java.util.*;

class ascending {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements Of Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Elements in Ascending Order");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        sc.close();
    }
}