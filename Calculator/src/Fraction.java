public class Fraction {

	public String toString() {
		return numerator + "/" + denominator;
	}

	public int numerator;
	public int denominator;

	public Fraction(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}

	public Fraction add(Fraction other) {
		int newNumer = numerator * other.denominator;
		int newDenom = denominator * other.denominator;
		int newNumer2 = other.numerator * denominator;

		int numerSum = newNumer + newNumer2;

		return new Fraction(numerSum, newDenom);
	}

}
