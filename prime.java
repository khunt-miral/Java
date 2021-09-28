
// //prime numbers between 3 to 100
import java.util.Scanner;

class prime {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int start = s.nextInt();
        System.out.print("Enter the ending number:");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " to " + end);
        s.close();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
