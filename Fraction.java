//Chapter 11
import java.util.Scanner;
public class Fraction{

	private int num;
	private int den;

	Fraction(int a, int b){
		num = a;
		den = b;
	}

	public String toString(){
		String ss = num + "/" + den;
		return ss;
	}

	public void enter(){
		String strFraction = IBIO.input("enter fraction (a/b format): ");
		strFraction = strFraction.replace("/", " ");
		Scanner parse = new Scanner(strFraction);
		num = parse.nextInt();
		den = parse.nextInt();
		//this.simplify();

	}

	public int lcm(int a, int b){
		int base = 0;
		int adder = 0;
		int divider = 0;	
		if(a > b){
			base = a;
			adder = a;
			divider = b;
		}
		else{
			base = b;
			adder = b;
			divider = a;
		}
		while(true){
			base = base + adder;
			if(base % divider == 0){
				return base;
			}
		}

	}

	public Fraction add(Fraction b){
		Fraction c = new Fraction(0,0);
		if(this.den == b.den){
			c.num = this.num + b.num;
			c.den = this.den;
			return c;
		}
		else{
			c.den = lcm(this.den, b.den);
			int m1 = c.den / this.den;
			int m2 = c.den / b.den;
			c.num = (this.num * m1) + (b.num * m2);
			return c;
		} 
	}

	public double toDecimal(){
		double decimal = this.num / this.den;
		System.out.println(decimal);
		return decimal;
	}
}