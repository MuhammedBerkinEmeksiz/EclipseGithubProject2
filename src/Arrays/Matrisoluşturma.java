package Arrays;

import java.util.Scanner;

public class Matrisoluşturma {

	public static void main(String[] args) {
		int[][] MULTIPLICATION_TABLE = new int[5][5];
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
                System.out.print(" ");
            }                              
            System.out.println();
	}

}
}
