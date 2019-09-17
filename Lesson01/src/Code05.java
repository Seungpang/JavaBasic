
public class Code05 {

	public static void main(String[] args) {
		//declare the array
		int []grades;
		
		//allocate memory for 5 indices
		grades = new int[5]; //실제 배열이 만들어지는 시점은 여기
		
		//assign some values to the array
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
	}

}
