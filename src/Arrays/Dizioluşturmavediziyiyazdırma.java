package Arrays;

import java.util.Scanner;

public class Dizioluşturmavediziyiyazdırma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("dizi uzunluğunun ne kadar olması gerektiğini giriniz=>");
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.print("data dizisindeki"+i+".sayıyı giriniz=>");
			data[i] = scanner.nextInt();
		}
		if(n%2==0) {
			for(int i = data.length-1;i>=0;i--) {
				System.out.println(data[i]);
			}
		}
		else {
			for(int i = 0;i<data.length;i++) {
				System.out.print(data[i]+",");
			}
		}
    }
}
