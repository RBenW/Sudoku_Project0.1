//Ben Wagner

//Put name at top if you contributed^
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int promptForValidValue(int lowerBound, int upperBound) {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		int result = 0;
		while(!exit) {
			result = scan.nextInt();
			if(result >= lowerBound || result <= upperBound)
				exit = true;
		}
		
		return result;
	}
}
