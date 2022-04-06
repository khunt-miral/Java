import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        int operator;
        double number1, number2, result;
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println(
                        "Choose 1 for addition \n 2 for subtraction\n 3 for multiplication \n 4 for division\n");
                operator = input.nextInt();
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble(); 

                switch (operator) {

                    case 1:
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;

                    case 2:
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;

                    case 3:
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;

                    case 4:
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;
                }
            }
        }
    }
}