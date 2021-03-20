package homeWork;
import java.util.*;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no: ");
		num1 = sc.nextDouble();
		System.out.println("Enter second no: ");
		num2 = sc.nextDouble();
		System.out.println("Choose operation (+, -, *, /): ");
		char op = sc.next().charAt(0);
		double output = 0;
		switch (op) {
		case '+':
			output = num1 + num2;
			break;
		case '-':
			output = num1 - num2;
			break;
		case '*':
			output = num1 * num2;
			break;
		case '/':
			output = num1 / num2;
			break;
		default:
			System.out.println("You have entered wrong operation");
			break;
		}
		
		System.out.println("Result is: " +output);
	}

}
