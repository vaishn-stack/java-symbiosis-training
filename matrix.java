//addition of 2 matrices to give the third matrix
public class matrix 
{
    public static void main(String[] args) 
    {
        
        int matrix1[][] = {{1,2},{5,6},{7,8}};
        int matrix2[][] = {{1,3},{5,7},{4,6}};
        int matrix3[][] = new int[3][2];
         
        // Add two matrix
        for(int i=0;i<matrix1.length;i++)
         {
            for (int j=0; j<matrix1[0].length;j++) 
            {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The Matrix3 =");
        for(int i=0;i<matrix3.length;i++) 
        {
            for(int j=0;j<matrix3[0].length;j++)
             {
                System.out.print(matrix3[i][j] + "  ");
            }
            System.out.println();
        }
 
    }
 
}

