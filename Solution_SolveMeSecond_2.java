import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution_SolveMeSecond_2 {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<String> readInt = new ArrayList<String>();

			int numOfTestCases = in.nextInt();
			for(int i=0; i<numOfTestCases; i++) {
				readInt.add(in.nextLine());
			}
			
			for(String cases : readInt) {
				String[] inputLine = stringToInt(cases);
				int sum = 0;
				for (String val : inputLine) {
					sum = sum + Integer.parseInt(val);	
				}
				System.out.println(sum);
			}
		}	


		private static String[] stringToInt(String inputVal) {
			String[] vals = inputVal.split("\\s+");
			return vals;	
		}

	}
