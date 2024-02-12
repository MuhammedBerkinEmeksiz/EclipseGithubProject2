package Arrays;

public class Dizilerdeüçgendizioluşturma {
	public static int [][] array = new int [10][];
	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new int [i+1];
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i+j;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
