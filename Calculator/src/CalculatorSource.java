import java.util.Scanner;

public class CalculatorSource {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // initializing the scanner
		int result = 0; // initializing result so it will work later on

		while (0 < 1) {
			System.out
					.println("If you would like to work with fractions, Please press F. Otherwise press N.");
			String f = scan.next();
			if (f.equals("f")) {
				System.out.println("Imput a Numerator");
				int firstNumerator = scan.nextInt();
				System.out.println("Imput a Denominator");
				int firstDenominator = scan.nextInt();
				System.out.println("Imput your second Numerator");
				int secondNumerator = scan.nextInt();
				System.out.println("Imput your second Denominator");
				int secondDenominator = scan.nextInt();
				
				Fraction fraction1 = new Fraction (firstNumerator, firstDenominator);
				Fraction fraction2 = new Fraction (secondNumerator, secondDenominator);
				
				System.out.println("Enter an operation (addition is the only one that works)");
				String add = scan.next();
				if(add.equals("+")){ 
					
					System.out.println(fraction1.add(fraction2));
					
				}
				
			}

			else {

				System.out
						.println("Please input a number (X) then input an operation (+,-,*,/,^) then the second number (Y)");
				int x = scan.nextInt();
				String o = scan.next();
				int y = scan.nextInt();

				if (o.equals("+")) { // how add works

					result = x + y;

				}

				else if (o.equals("-")) { // how subtract works

					result = x - y;

				}

				else if (o.equals("*")) { // how multiply works

					result = x * y;

				}

				else if (o.equals("/")) { // how divide works

					result = x / y;

				}

				else if (o.equals("^")) {

					result = (int) Math.pow(x, y);

				}

				System.out.println(result); // how it prints result of the
											// equation

			}

		}

	}

}
