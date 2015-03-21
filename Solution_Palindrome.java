import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_Palindrome {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		int cases;
//		cases = scan.nextInt();
//		scan.nextLine();
//		for(int i=0; i<cases; i++){
//			String input = scan.nextLine();
//			solveForPalindrome(input);
//		}
//		scan.close();
		
		File file = new File("C:\\inp.txt");
		try {
			Scanner scan = new Scanner(file);
			String input = scan.nextLine();
			input.trim();
			solveForPalindrome(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

	private static void solveForPalindrome(String input) {
		boolean bool = isPalindrome(input);
		if(bool){
			System.out.println(-1);
			return;
		}
		for(int i=0; i<input.length(); i++){
			String trimmedString = input.substring(0,i);
			String remainingStr = input.substring(i+1);
			String finalStr = trimmedString + remainingStr;
			boolean bool2 = isPalindrome(finalStr);
			if(bool2){
				System.out.println(i);
				break;
			}
		}

	}

	private static boolean isPalindrome(String input) {
		if(input.length() == 1){
			return true;
		}

		String reverseStrn = new StringBuffer(input).reverse().toString();
		if(input.equals(reverseStrn)){
			return true;
		}
		else {
			return false;
		}

	}

}
