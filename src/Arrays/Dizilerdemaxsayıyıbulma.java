package Arrays;

import java.util.Scanner;

public class Dizilerdemaxsayıyıbulma {
	 public static int[] array;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = Integer.parseInt(scanner.nextLine());
	        System.out.println("n="+n);
	        array = new int[n];
	        for (int i = 0; i < n; i++) {
				array[i] = Integer.parseInt(scanner.nextLine());
			}
	        int max = array[n-1];
	        for (int i = 1; i < array.length; i++) {
				int number = array[i];
				if(number > max) {
					max = number;
				}
			}
	        System.out.println(max);
	    }
	}
