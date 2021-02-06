package StringPrograms;

public class SwapTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		
		String firstName = "Amod";
		String lastName = "Mahajan";
		
		firstName = firstName+lastName;
		lastName = firstName.substring(0,firstName.length()-lastName.length());
		firstName = firstName.substring(lastName.length());
		
		System.out.println(firstName);
		System.out.println(lastName);
	}
}
