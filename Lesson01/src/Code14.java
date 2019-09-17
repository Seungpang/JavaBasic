import java.util.Scanner;
/*
 * 사용자로부터 n개의 정수를 입력받은 후 오름차순으로 정령하여 출력하는 코드이다.
 */
public class Code14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0;i<n;i++)
			data[i] = kb.nextInt();
		kb.close();
		
		//buble sort
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j]>data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp; 
				}
			}
			System.out.println("Sorted data:");
			for(int k=0; k<n; k++)
				System.out.println(data[k]);
		}
	}

}
