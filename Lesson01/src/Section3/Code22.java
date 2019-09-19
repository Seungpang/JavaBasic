package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 입력으로 하나의 텍스트 파일을 읽는다. (sample.txt)
 * 텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에 등장하는 횟수를 센다.
 * 단, 단어 개수는 100,000개 이하라고 가정한다.
 * 사용자가 요청하면 단어 목록을 하나의 파일로 저장한다.
 * 사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇번 등장하는지 출력한다.
 */
public class Code22 {
	static String [] words = new String [100000];
	static int [] count = new int [100000];
	static int n;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex( fileName);
				
			}
			else if(command.equals("find")) {
				String str = kb.next();
				int index = findWord(str);
				if(index > -1) {
					System.out.println("The word " + words[index] +" appears " + count[index]+ " times.");
				}
				else
					System.out.println("The word " + str +" does not appear." );
				
			}
			else if(command.equals("saveas")) {
				String fileName = kb.next();
				saveAs(fileName);
				
			}
			else if(command.equals("exit"))
				break;
		}
		kb.close();
		
		for(int i=0;i<n;i++)
			System.out.println(words[i]+" "+ count[i]);
	}
	
	
	static void saveAs(String fileName) {
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n;i++) {
				out.println(words[i]+" "+count[i]);
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Svae failed.");
		}

	
	}
	
	
	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				addWord(str);
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			return;
		}
	}
	
	
	static void addWord(String str) {
		int index = findWord(str); //return -1 if not found
		if(index != -1) { //found
			count[index]++;
		}
		else {         //not found
			words[n] = str;
			count[n] = 1;
			n++;
		}
	}
	
	
	static int findWord(String str) {
		for(int i=0; i<n; i++)
			if(words[i].equals(str))
				return i;
		return -1;
	}
}
