import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int n1 = sc.nextInt();
            System.out.println("Enter second number:");
            int n2 = sc.nextInt();
            System.out.println("Enter the number you want to divide by:");
            int n = sc.nextInt();

            for (int i = n1; i <= n2; i++) {
                if (i % n == 0) {
                    System.out.println(i);
                }
            }
        }
        
    }
}

