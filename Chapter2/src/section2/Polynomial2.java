package section2;

public class Polynomial2 {
	public char name;
	public int nTerms = 0;
	public Term2[] terms;

	
	public void addTerm(int c, int e) {
		int index = findTerm(e);
		if(index != -1) {
			terms[index].coef += c; // -5x^3 5x^3이면 0이되서 삭제해줘야함
			
		}
		else {
			int i = nTerms-1;
			while(i >=0 && terms[i].expo < e ) {
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term2();
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nTerms++;
		}
		
	}

	public int findTerm(int e) {
		for(int i=0;i<nTerms && terms[i].expo >=e;i++)
			if(terms[i].expo == e)
				return i;
		return -1;
	}
	public int calcPolynomial( int x) {
		int result = 0;
		for(int i=0;i<nTerms;i++)
			result += terms[i].calcTerm(x);
		return result;
	}


	public void printPolynomial() {
		for(int i=0;i<nTerms; i++) {
			terms[i].printTerm();
			if(terms[i+1] != null)
				System.out.print("+");
		}
		System.out.println();
	}
}
