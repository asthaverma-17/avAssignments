import java.util.Scanner;

@FunctionalInterface
interface ArithmeticOperation {
    double calculate(int num1, int num2);
}

public class Assignment7Q1 {
    public double addition(int num1, int num2) {
        ArithmeticOperation add = (a, b) -> a + b;
        return add.calculate(num1, num2);
    }

    public double subtraction(int num1, int num2) {
        ArithmeticOperation subtract = (a, b) -> a - b;
        return subtract.calculate(num1, num2);
    }

    public double multiplication(int num1, int num2) {
        ArithmeticOperation multiply = (a, b) -> a * b;
        return multiply.calculate(num1, num2);
    }

    public double division(int num1, int num2) {
        ArithmeticOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot be divided by zero");
            }
            return (double) a / b;
        };
        return divide.calculate(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        Assignment7Q1 assignment = new Assignment7Q1();

        System.out.println(assignment.addition(num1, num2));
        System.out.println(assignment.subtraction(num1, num2));
        System.out.println(assignment.multiplication(num1, num2));
        System.out.println(assignment.division(num1, num2));
    }
}
