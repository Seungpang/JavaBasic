package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Code02 {

	static Person1[] members;
	static int n=0;
	
	public static void main(String[] args) {
		members = new Person1[100];
		
		try {
			Scanner in = new Scanner(new File("input.txt"));
			while(in.hasNext()) {
				String nm = in.next();
				String nb = in.next();
				
				members[n] =new Person1();
				members[n].name = nm;
				members[n].number = nb;
				n++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("no data file");
			
		}
		for(int i=0;i<n;i++) {
		System.out.println(members[i].name + " " +members[i].number);
	
		}
	}

}
