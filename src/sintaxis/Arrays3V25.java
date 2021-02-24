package sintaxis;

public class Arrays3V25 {

	public static void main(String[] args) {
		
		int matrix [][] = new int [2][5];
		      //i  j
		matrix [0][0]=10;
		matrix [0][1]=65;
		matrix [0][2]=23;
		matrix [0][3]=33;
		matrix [0][4]=67;
		      //i  j
		matrix [1][0]=56;
		matrix [1][1]=34;
		matrix [1][2]=89;
		matrix [1][3]=34;
		matrix [1][4]=99;


		for(int j = 0; j < 1; j++) {

			for(int i = 0; i < 2; i++) {
				System.out.println();
				System.out.print(" "+ matrix[i][j]);

			}
		}

	}

}
