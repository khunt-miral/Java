import java.util.Scanner;

public class gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter devident:");
        int devident = sc.nextInt();
        System.out.print("Enter devisior:");
        int devisor = sc.nextInt();
        sc.close();

        while (devident % devisor != 0) {
            int rem = devident % devisor;

            devident = devisor;
            devisor = rem;
        }

        System.out.println(devisor);
    }
}
