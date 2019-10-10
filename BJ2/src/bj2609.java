import java.util.Scanner;

public class bj2609 {
	
	public static int gcd(int x, int y) {
		while(y>0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		return x;
	}
	
	public static int lcm(int x, int y) {
		
		return (x * y) / gcd(x, y);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		kb.close();
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
	}
}
