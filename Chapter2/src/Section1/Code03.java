package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * input.txt��� ���Ϸ� ���� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ����Ѵ�.
 */
public class Code03 {
	static Person1[] members = new Person1[1000];
	static int n = 0;
	
	public static void main(String[] args) {

		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) {
				members[n] = new Person1();
				
				members[n].name = inFile.next();
				members[n].number = inFile.next();
				n++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(9);
		}
		bubbleSort();
		for(int i=0; i<n; i++)
			System.out.println(members[i].name + ": " + members[i].number);
		
	}

	static void bubbleSort() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(members[j].name.compareTo(members[j+1].name)>0) {
					
					Person1 tmp = members[j];
					members[j] = members[j+1];
					members[j+1] = tmp;

				}
			}
		}

	}

}
