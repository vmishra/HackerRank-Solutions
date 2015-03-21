import java.util.Arrays;
import java.util.Scanner;


public class Solution_Panagram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input;
		input = scan.nextLine();
		checkForAnagram(input);
		System.out.println("pangram");

	}

	private static void checkForAnagram(String input) {
		String lowerCase  = input.toLowerCase();
		String anagramSample = "The quick brown fox jumps over the lazy dog";
		char[] c1 = lowerCase.replaceAll("\\s+", "").toCharArray();
		char[] c2 = anagramSample.toLowerCase().replaceAll("\\s+", "").toCharArray();
		Arrays.sort(c2);
		Arrays.sort(c1);
		for (char c : c2) {
			int index = Arrays.binarySearch(c1, c);
			boolean ifExists = index >= 0;
			if(!ifExists) {
				System.out.println("not pangram");
				System.exit(1);
			}
		}		

	}

}
