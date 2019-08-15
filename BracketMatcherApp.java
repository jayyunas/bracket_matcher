import java.io.*;
import java.util.Scanner;
public class BracketMatcherApp{
		
	public static void main(String[] args){
		BracketMatcher match = new BracketMatcher();
		System.out.println("Input a String as you would in java:"); //opening line
		Scanner s = new Scanner(System.in);
		String answer = s.nextLine();
		System.out.println(match.checkBrackets(answer));

	}
}
		
		