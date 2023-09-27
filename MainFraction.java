public class MainFraction{
	
	public static void main(String [ ] args){
		Fraction a = new Fraction(0,0);
		a.enter();
		Fraction b = new Fraction(0,0);
		b.enter();
		Fraction c = new Fraction(0,0);
		c = a.add(b);
		System.out.println(c);

		double x = c.toDecimal();
		System.out.println("As a decimal it = " + x);

	}
}