package Arrays;

public class Dizilerdeçokludizioluşturma {
	public static int[][][] multiarray = new int[][][] {{{5,89,17},{0,1,2,3,4}},{{78},{99}},{{1,5,8,7,7},{},{2,8},{2,5,55,89,86,8},}};
	public static void main(String[] args) {
		for (int i = 0; i < multiarray.length; i++) {
			for (int j = 0; j < multiarray[i].length; j++) {
				for (int k = 0; k < multiarray[i][j].length; k++) {
					System.out.print(multiarray[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("+++++++++");
		}
	}

}
