package Section1;

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
/*
 * 문제점!
 * 소수점,쉼표 등의 특수기호가 단어에 포함된다.
 * 숫자 등이 단어로 취급된다.
 * 대문자와 소문자가 다른 언어로 취급된다.
 * 단어들이 알파벳 순으로 정렬되면 좋겠다.
 */

public class IndexMaker {
	static Item [] items = new Item [100000];
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
					System.out.println("The word " + items[index].word +" appears " + items[index].count+ " times.");
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
			System.out.println(items[i].word+" "+ items[i].count);
	}
	
	
	static void saveAs(String fileName) {
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n;i++) {
				out.println(items[i].word+" "+items[i].word);
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
				
				String trimmed = trimming(str);
				if(trimmed != null) {
					String t = trimmed.toLowerCase();
					addWord(t);
				}	
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			return;
		}
	}
	
	
	static String trimming(String str) {

		int i = 0, j = str.length()-1;
		
		while( i< str.length() && !Character.isLetter(str.charAt(i)))
			i++;
		
		while( j>= str.length() && !Character.isLetter(str.charAt(j)))
			j--;
		
		if(i>j)
			return null;
		return str.substring(i, j+1);
	}


	static void addWord(String str) {
		int index = findWord(str); //return -1 if not found
		
		if(index != -1) { //found
			items[index].count++;
		}
		else {         //not found
			int i = n-1;
			while( i >= 0 && items[i].word.compareTo(str) > 0) {
				items[i] = new Item();
				items[i+1] = items[i];
				i--;
			}
			items[n].word = str;
			items[n].count = 1;
			n++;
		}
	}
	
	
	static int findWord(String str) {
		for(int i=0; i<n; i++)
			if(items[i].word.equals(str))
				return i;
		return -1;
	}
}
