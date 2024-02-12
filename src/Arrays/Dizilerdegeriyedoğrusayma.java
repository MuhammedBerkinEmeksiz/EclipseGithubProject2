package Arrays;

import java.util.Scanner;

public class Dizilerdegeriyedoğrusayma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();		
		}
		for (int i = 4; i>=0; i--) {
			System.out.println(array[i]);
		}
	}
}
