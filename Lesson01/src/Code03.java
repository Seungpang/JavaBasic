import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please type a string: ");
		input = kb.next();
		/* next()�޼���� �ϳ��� ���ڿ��� �о��ش�. 
		 * �̿ܿ��� �Ǽ��� ���� ���� nextDouble(), 
		 * �� ������ ��°�� ���� ���� nextLine()���� �ִ�.
		 */
		if(str.equals(input)) {
			/*string�� ==���� �� �� ����
			 * ==�� ������Ƽ�� Ÿ�Կ��� ��밡��
			 */
			System.out.println("Strings match! :-)");
		}else {
			System.out.println("Strings do not match! :-(");
		}
		kb.close();
	}

}
