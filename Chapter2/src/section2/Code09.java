package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * ���� ��ǥ�࿡ ������ n���� ���簢���� ���� �����͸� �Է� ���� ��
 * ������ ���� �ͺ��� ū �� ������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * �Է� ������ ����:
 * 0 1 2 4 //���� ���� �������� ��ǥ�� (0,1)�̰�, �ʺ� 2, ���̰� 4
 * 1 4 7 8
 * 4 3 12 9
 * 8 18 11 30
 * 5 10 6 11 
 */
public class Code09 {

	static MyRectangle2 [] rects = new MyRectangle2[100];
	static int n = 0;
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while(in.hasNext())
				rects[n++] = new MyRectangle2(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("no data file");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i=0;i<n;i++) {
			System.out.println(rects[i].toString());
		}
		
		

	}

	private static void bubbleSort() {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(rects[j].calcArea() > rects[j+1].calcArea()) {
					MyRectangle2 tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
		
	}

}
