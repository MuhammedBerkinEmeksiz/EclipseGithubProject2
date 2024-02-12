package Arrays;

import java.util.Scanner;
public class Dizilerdeikiboyutludizioluşturma {
	public static int[][] multiarray;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizi kac satirdan olusacak:");
		int n = Integer.parseInt(scan.nextLine());
		multiarray = new int[n][];
		for (int i = 0; i < n; i++) {
			System.out.print(i+".satirdaki eleman sayisi kac olucak:");
			int size = Integer.parseInt(scan.nextLine());
			multiarray[i] = new int[size];
			for (int j = 0; j < multiarray[i].length; j++) {
		        System.out.print(multiarray[i][j] + " ");
		    }
		}
	}

}
