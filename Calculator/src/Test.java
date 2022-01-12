import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		boolean isTrue = true;
		int choice;
		
		Scanner scan = new Scanner(System.in);
		while(isTrue) {
			double firstNumber;
			double secondNumber;
			System.out.println("Please make your selection: ");
			System.out.println(" Select '1'  to add");
			System.out.println(" Select '2'  to substract");
			System.out.println(" Select '3'  to multiply");
			System.out.println(" Select '4'  to divide.");
			System.out.println(" Select '5'  to terminate the program.");
			choice=scan.nextInt();
			
			
			if(choice==1) {
				System.out.println("-Addition-");
				System.out.println("Enter the first number: ");
				 firstNumber= scan.nextDouble();
				System.out.println("Enter the second number: ");
				 secondNumber= scan.nextDouble();
				System.err.println(firstNumber +" + "+ secondNumber +" = " + (firstNumber+secondNumber));
			}
			if(choice==2) {
				System.out.println("-Substraction-");
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				System.err.println(firstNumber +" - "+ secondNumber +" = " + (firstNumber - secondNumber));
			}
			if(choice==3) {
				System.out.println("-Multiplication-");
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				System.err.println(firstNumber +" * "+ secondNumber +" = " + (firstNumber * secondNumber));
			}
			if(choice==4) {
				System.out.println("-Division-");
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextDouble();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextDouble();
				if(secondNumber == 0) {
					System.err.println("Undefined since the second number is '0'");
					continue;
				}
				System.err.println(firstNumber +" / "+ secondNumber +" = " + (firstNumber / secondNumber));
			}
			if(choice==5) {
				System.err.println("The program has terminated.");
				break;
			}
			if(choice < 1 || choice > 5) {
				System.err.println("Please enter a valid number.");
			}
				
		}

	}

}
