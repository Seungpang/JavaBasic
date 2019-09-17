import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please type a string: ");
		input = kb.next();
		/* next()메서드는 하나의 문자열을 읽어준다. 
		 * 이외에도 실수를 읽을 때는 nextDouble(), 
		 * 한 라인을 통째로 읽을 떄는 nextLine()등이 있다.
		 */
		if(str.equals(input)) {
			/*string은 ==으로 할 수 없음
			 * ==은 프리미티브 타입에서 사용가능
			 */
			System.out.println("Strings match! :-)");
		}else {
			System.out.println("Strings do not match! :-(");
		}
		kb.close();
	}

}
