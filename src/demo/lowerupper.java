package demo;

public class lowerupper {

	public static void main(String[] args) {
		String input = "this is lowercase";
		System.out.println("Lower case is: " +input);
		char strArry[] = input.toCharArray();
		
		for(int i=0; i<strArry.length; i++) {
			if(strArry[i] >='a' && strArry[i] <='z') {
				strArry[i] = (char) ((int) strArry[i] - 32);			
			}
		}
		System.out.println("Uppercase is: ");
		for(int i = 0; i<strArry.length; i++) {
			System.out.print(strArry[i]);
		}
	}
}
