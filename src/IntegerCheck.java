import java.util.Scanner;

public class IntegerCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String prompt;
		do {
			System.out.println("Enter a number between 1 and 100 :");
			int num = scan.nextInt();

			if (num >= 1 && num <= 100) {

				if ((num % 2) == 0 && num <= 25) {
					System.out.println("output here ,Even and less than 25");
				} else if ((num % 2 == 0) && (num > 25) && (num <= 60)) {
					System.out.println("output here ,Even ");
				} else if ((num % 2 == 0) && (num > 60)) {
					System.out.println("output here ,Even and over 60");
				} else if ((num % 2 == 1) && (num <= 60)) {
					System.out.println("output here ," + num + "and Odd");
				} else if ((num % 2 == 1) && (num > 60)) {
					System.out.println("output here odd and over 60");
				}

				} else {
				System.out.println("Please enter a valid number betwen 1 and 100");
				}

				System.out.println("Continue?(y/n):");

				prompt = scan.next();
				} while (prompt.equalsIgnoreCase("Y"));
		        System.out.println("Sign off");

				scan.close();

	}

}
