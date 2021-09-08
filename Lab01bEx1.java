import java.util.Scanner;

public class ProdQty {

	public static void main(String[] args) {
		// Initialise User Input
		Scanner input = new Scanner(System.in);

		// Define the variables
		double prod1 = 0;
		double prod2 = 0;
		double prod3 = 0;
		int qty;
		// It is -1, since 0, will lead it to never run - since 0 is the condition to
		// stop it
		int prodnum = -1;
		double total;

		// Asking for user input
		while (prodnum != 0) {
			System.out.println("Enter Product Number (1-3). 0 to end: ");
			prodnum = input.nextInt();
			if (prodnum != 0) {
				System.out.println("Enter the amount of quantity: ");
				qty = input.nextInt();
				switch (prodnum) {
				// All the possible cases that occur
				case 1:
					total = qty * 2.98;
					prod1 = +total;
					break;
				case 2:
					total = qty * 4.50;
					prod2 = +total;
					break;
				case 3:
					total = qty * 9.98;
					prod3 = +total;
					break;
				// Error Testing - simple
				default:
					System.out.println("Wrong product number entered: ");

				}
			}
		}

		System.out.println("Product 1: " + prod1);
		System.out.println("Product 2: " + prod2);
		System.out.println("Product 3: " + prod3);
	}

}
