package practices;
import java.util.Scanner;
public class calculatorMiniProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f%n", result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f%n", result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f%n", result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f%n", result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
