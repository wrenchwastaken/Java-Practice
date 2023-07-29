import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " natural numbers is " + sum);
        sc.close();
    }
}