import java.util.ArrayList;
import java.util.Scanner;


public class Solution_Lonely_Integer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		String stringOfInts = scan.nextLine();
		ArrayList<Integer> elements = intArrayFromString(stringOfInts);
		for (Integer inr : elements) {
			ArrayList<Integer> clonedElem = new ArrayList<Integer>(elements);
			clonedElem.remove(inr);
			boolean bool = clonedElem.contains(inr);
			if(!bool) {
				System.out.println(inr);
			}


		}
	}


	private static ArrayList<Integer> intArrayFromString(String stringOfInts) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] str =  stringOfInts.split("\\s+");
		for(int i=0; i<str.length; i++){
			list.add(Integer.parseInt(str[i]));
		}
		return list;
	}
}

