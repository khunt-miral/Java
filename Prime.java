import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  b, i, j, flag;

        System.out.println("Upto what limit you want prime numbers ?");
        b = sc.nextInt(); 

        System.out.println("Prime numbers are:");

        for (i = 2; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
