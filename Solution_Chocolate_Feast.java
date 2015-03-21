import java.util.Scanner;


public class Solution_Chocolate_Feast
 {
	
	private static long chocYoueat = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<cases; i++) {
			System.out.println(solve(scan.nextLong(),scan.nextLong(),scan.nextLong()));
			chocYoueat = 0;
		} 
		scan.close();

	}

	private static long solve(long totalBucks, long costOfChocs, long wrappersPerChoc) {

		long chocs = totalBucks/costOfChocs;
		long chocYoueat = resolveTheWrappers(chocs, wrappersPerChoc);
		chocYoueat = chocs + chocYoueat;
		return chocYoueat;
	}

	private static long resolveTheWrappers(long wrappers, long wrappersPerChoc) {
		long chocsFromWrappers = wrappers / wrappersPerChoc;
		long remainder = wrappers % wrappersPerChoc; 
		chocYoueat = chocYoueat + chocsFromWrappers;
		if(chocsFromWrappers + remainder >= wrappersPerChoc) {
			chocYoueat = resolveTheWrappers(chocsFromWrappers + remainder, wrappersPerChoc);
		}
		return chocYoueat;
	}

}
