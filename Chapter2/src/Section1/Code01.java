package Section1;

public class Code01 {

	public static void main(String[] args) {
		
		Person1 first;
		first = new Person1();
		
		first.name = "Seungpnag";
		first.number = "14235325345";
		System.out.println("Name:" + first.name + ", Number:" + first.number);
		
		Person1[] members;
		members = new Person1[100];
		
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "kim";
		members[1].number = "324234234";
		
		System.out.println("Name:" + members[1].name + ", Number:" + members[1].number);
	}

}
