package arrays;

public class SetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static void setZeroes(int[][] matrix) {
    	int row=-1;
    	int column=-1;
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        	{
        		if(matrix[i][j]==0)
        		{
        			row=i;
        			column=j;
        		}
        	}
        }
    }
}
