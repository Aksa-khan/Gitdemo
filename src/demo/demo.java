package demo;

public class demo {
	public static void main(String args[]) {
		String input = "this is input";
		System.out.println("lower case Srting is: " +input);
		char stringArray[] = input.toCharArray();
		for (int i = 0; i < stringArray.length; i++ ) {
			if(stringArray[i] >= 'a' && stringArray[i] <= 'z') {
				stringArray[i] = (char) ((int) stringArray[i] - 32);
			}
		}
		System.out.print("Uppercase is: ");
		for(int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
		
		
}
}
