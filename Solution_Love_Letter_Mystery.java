import java.util.Scanner;


public class Solution_Love_Letter_Mystery {

	static int hops = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases;
		cases = scan.nextInt();
		String inputStr =" ";
		scan.nextLine();
		for(int i=0; i<cases; i++) {
			hops = 0;
			inputStr = scan.nextLine();	
			System.out.println(hopsToPalindrome(inputStr));
		}
	}

	public static int hopsToPalindrome(String str) {
		if(str.length() == 1){
			return 0;
		} else {
			boolean bool = isPalindrome(str);
			if(bool) {
				return 0;
			} else {
				shiftTheAlphabets(str);
				return hops;
			}
		}

	}

	private static void shiftTheAlphabets(String str) {
		if(isPalindrome(str)){
			return;
		}
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1); 
		if (last > first) {
			hops = hops + (last - first);
			String modStr = str.substring(0, str.length()-1) + first;
			boolean bool = isPalindrome(modStr);
			if(!bool) {
				String strippedModStr = modStr.substring(1, modStr.length()-1);
				shiftTheAlphabets(strippedModStr);
			} else {
				return;
			}

		} else if(last < first) {
			hops = hops + (first - last);
			String modStr = last + str.substring(1);
			boolean bool = isPalindrome(modStr);
			if(!bool) {
				String strippedModStr = modStr.substring(1, modStr.length()-1);
				shiftTheAlphabets(strippedModStr);
			} else {
				return;
			}
		}

	}

	private static boolean isPalindrome(String strn) {
		if(strn.length() == 1){
			return true;
		} 
		String reverseStrn = new StringBuffer(strn).reverse().toString();
		if(strn.equals(reverseStrn)) {
			return true;
		} else {
			return false;
		}

	}

}
