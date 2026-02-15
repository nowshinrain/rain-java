import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digit;
        int count = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Calculate Armstrong sum
        while (num != 0) {
            digit = num % 10;
            sum += Math.pow(digit, count);
            num = num / 10;
        }

        // Check result
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
