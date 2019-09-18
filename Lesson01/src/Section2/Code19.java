package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * input.txt라는 파일로 부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력한다.
 */
public class Code19 {

	public static void main(String[] args) {
		String [] name = new String [1000];
		String [] number = new String [1000];
		int n = 0;
		
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) {
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(9);
		}
		for(int i=0; i<n; i++)
			System.out.println(name[i] + ": " + number[i]);
		
	
	}

}
