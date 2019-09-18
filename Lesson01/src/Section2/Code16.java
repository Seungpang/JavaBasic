package Section2;
/*
 * 입력으로 두 정수 a와 b를 받아 a의 b승을 계산한다.
 * b는 음이아닌 정수
 */
import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a,b);
		
		System.out.println(result);
		kb.close();
	}
	static int power(int n, int m) 
	{	
		int prod = 1;
		for(int i=0; i<m;i++)
			prod *= n;
		return prod;
	}
}
