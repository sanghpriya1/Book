
public class Mat {
//	private static int[][] mat;
//	private static boolean Check_All_Zeors() {
//		return false;
//	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] { {1,2,3},{4,5,6},{7,8,9} };
		int rows = matrix.length;
		int cols = matrix[0].length;
		
        for(int i = 0; i < rows; i++){
            for(int j = i+1; j < cols; j++){
                {
                    matrix[i][j] = matrix[j][i];
                }
            }
        }
		
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                {
                    System.out.println(matrix[i][j]);
                }
            }
        }
		
		
	}
}
