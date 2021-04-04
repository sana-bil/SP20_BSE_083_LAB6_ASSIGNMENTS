import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        System.out.println("Addition: ");
        Calculator.sum(num1,num2);
        System.out.println();
        System.out.println("Subtraction: ");
        Calculator.subtract(num1,num2);
        System.out.println();
        System.out.println("Mod: ");
        Calculator.modulus(num1,num2);
        System.out.println();
        System.out.println("sin of first number: ");
        Calculator.sin(num1);
        System.out.println("sin of second number: ");
        Calculator.sin(num2);
        System.out.println();
        System.out.println("cos of first number: ");
        Calculator.cos(num1);
        System.out.println("cos of second number: ");
        Calculator.cos(num2);
        System.out.println();
        System.out.println("tan of first number: ");
        Calculator.tan(num1);
        System.out.println("tan of second number: ");
        Calculator.tan(num2);

    }
}
