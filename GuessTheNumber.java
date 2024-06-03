//Can't Handle Exceptions :  
import java.util.*;
public class GuessTheNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Game Design -->
		System.out.println("Welcome to GuessTheNumber Game");
		System.out.println("Choose the level you want to play");
		System.out.println("1)Easy          2)Medium          3)Hard          4)Default");

		int maxNum = 20;
		int level = 10;
		int chances = 5;

		//Level Loop-->
		while (level > 4 || level <= 0) {
			System.out.print("Enter your choice : ");
			level = input.nextInt();
			if (level == 1) {
				maxNum = 30;
			} else if (level == 2) {
				maxNum = 50;
			} else if (level == 3) {
				maxNum = 999999999;
				chances = 7; //So that it becomes easy to guess the number
			} else if (level == 4) {
				maxNum = 20;
			} else if (level > 4 || level <= 0) {
				System.out.println("Please Choose a valid level");
			}
		}
		//Getting the Random number -->
		Random rn = new Random();
		int rNum = rn.nextInt(maxNum);

		int in = 100000000;
		System.out.println("You have to guess the number between 0 and " + maxNum);

		//Loop Logic--->
		while (in != rNum) {
			System.out.print("Guess the number : ");
			in = input.nextInt();
			if (in == rNum) {
				System.out.println("Congratulations! You won the game");
				break;
			} else {
				chances--;
				System.out.println("Wrong Guess Try Again");
				System.out.println("Chances left " + chances);
			}
			if (chances == 0) {
				System.out.println("Oops! All the chances are over ");
				System.out.println("The correct number was " + rNum);
				break;
			}
			if (in < rNum) {
				System.out.println("[ Hint : Its A higher number than your guess ]");
			}

			if (in > rNum) {
				System.out.println("[ Hint : Its A lower number than your guess ]");
			}
		}
	}
}