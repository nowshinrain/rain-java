import java.util.Scanner;

public class GoldbachConjecture {

    // Method to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an even number greater than 2: ");
        int n = sc.nextInt();

        if (n <= 2 || n % 2 != 0) {
            System.out.println("Please enter a valid even number greater than 2.");
        } else {
            System.out.println("Prime pairs are:");

            for (int i = 2; i <= n / 2; i++) {
                if (isPrime(i) && isPrime(n - i)) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                }
            }
        }

        sc.close();
    }
}
