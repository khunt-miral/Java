import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Doller to Rupees converter  2.Rupees to Doller converter");
        int k = in.nextInt();

        switch (k) {
            case 1:
                float dollars;

                System.out.println("Please enter dollars:");

                dollars = in.nextLong();

                float rupees = dollars * 74;

                System.out.println(rupees + " Rupees");
                break;

            case 2:
                float rupee;

                System.out.println("Please enter rupees:");

                rupee = in.nextLong();

                float dollar = rupee / 74;

                System.out.println(dollar + " Dollars");
                break;

        }

    }

}

