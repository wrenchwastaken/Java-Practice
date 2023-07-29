import java.util.*;

class sumarray {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements Of Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = a[i] + sum;
        }
        System.out.println("The Sum of Array: " + sum);
        sc.close();
    }
}