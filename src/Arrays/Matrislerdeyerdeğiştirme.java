package Arrays;

public class Matrislerdeyerdeğiştirme {

	public static void main(String[] args) {
		int [][] matrix = {
				{1,2,3,4,5},{5,4,3,2,1}
		};
		System.out.println(matrix[0]);
		System.out.println(matrix[1]);
		int []temp = matrix[0];
		matrix[0] = matrix[1];
		matrix[1] = temp;
	}

}
