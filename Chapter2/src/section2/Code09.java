package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 폄면상에 좌표축에 평행한 n개의 직사각형에 관한 데이터를 입력 받은 후
 * 면적이 작은 것부터 큰 것 순으로 정렬하여 출력하는 프로그램을 작성하라.
 * 입력 파일의 형식:
 * 0 1 2 4 //왼쪽 위쪽 꼭지점의 좌표가 (0,1)이고, 너비가 2, 높이가 4
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
