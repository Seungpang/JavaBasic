package section3;

public class Term3 {
	private int coef;
	private int expo;
	
	public Term3(int c, int e)
	{
		setCoef(c);
		setExpo(e);
	}
	
	
	public int calcTerm( int x) {
		return (int) (getCoef() * Math.pow(x, getExpo()));
	}
	
	public void printTerm() {
		System.out.print(getCoef() + "x^" + getExpo());
		
	}


	public int getCoef() {
		return coef;
	}


	public void setCoef(int coef) {
		this.coef = coef;
	}


	public int getExpo() {
		return expo;
	}


	public void setExpo(int expo) {
		this.expo = expo;
	}
}
