package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 입력으로 하나의 직교 다각형(모든 변이 x-축 혹은 y-축과 평행한 다각형)과 또 하나의 점 p가 주어질 때
 * 그 점이 다각형의 내부에 있는지 외부에 있는지 판단하는 프로그램을 작성하라.
 */
public class Code10 {
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			int n = in.nextInt();
			OrthoPolygon thePolygon = new OrthoPolygon(n);
			for(int i=0;i<n;i++) 
				thePolygon.addVertex(in.nextInt(), in.nextInt());
			MyPoint2 thePoint = new MyPoint2(in.nextInt(), in.nextInt());
			in.close();
			if(thePolygon.contains(thePoint))
				System.out.println("Yes");
			else
				System.out.println("NO");
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists.");
			System.exit(1);
		}

	}

}
