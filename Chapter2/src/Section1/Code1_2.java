package Section1;

public class Code1_2 {
	public static void main(String[] args) {
		Person1 first = new Person1();
		first.name = "John";
		first.number = "34253235354";
		
		Person1 second = first;
		second.name = "Tom";
		System.out.println(first.name+", "+first.number);
		
		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = second;
		System.out.println(members[0].name+", "+members[0].number);
		System.out.println(members[1].name+", "+members[1].number);
	}
}
