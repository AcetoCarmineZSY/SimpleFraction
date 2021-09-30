package TD1;

public class Fraction {
	int numerateur;
	int denominateur;
	
	Fraction(int num, int denom){
		this.numerateur = num;
		this.denominateur = denom;
	}
	
	public String toString() {
		return "numerateur:" + this.numerateur + "\n" + "denominateur" + this.denominateur;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f = new Fraction(2,5);
		System.out.println(f.toString());
	}

}
