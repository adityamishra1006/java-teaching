import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int operand1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int operand2 = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);


        switch(operator){
            case '+': 
                System.out.println("Result : " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Result : " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Result : " + (operand1 * operand2));
                break;
            case '/':
                System.out.println("Result : " + (operand1 / operand2));
                break;
            default:
                System.out.println("Invalid Operation"); 
        }
    }
}
