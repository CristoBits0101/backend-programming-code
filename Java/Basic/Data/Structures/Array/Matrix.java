package Data.Structures.Array;

/**
 *           Use : Represents a two-dimensional structure of elements.
 *    Advantages : Useful for tabular data or mathematical matrices.
 * Disadvantages : Fixed size, less efficient for variable sizes.
 * */
public class Matrix
{
    public static void main(String[] args)
    {
        // Statement
        int[][]   matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][]   matrixB = new int[3][4];
        Class[][] matrixC = new Class[3][2];

        // Operation
        matrixB[0][0] = 4;                                  //    Add element
        matrixB[0][0] = 5;                                  // Update element

        // Iteration
        for (int i = 0; i < matrixA.length ; i++)           // For .length when is <
        {
            for (int j = 0; j < matrixA.length ; j++)
            {
                System.out.println(matrixA[i][j]);
            }
        }

        for (int i = 0; i <= matrixA.length -1 ; i++)       // For .length -1 when is <=
        {
            for (int j = 0; j <= matrixA.length -1 ; j++)
            {
                System.out.println(matrixA[i][j]);
            }
        }

        for (int row[] : matrixA)                           // Foreach
        {
            for ( int columnElement : row)
            {
                System.out.println(columnElement + " ");
            }

            System.out.println();
        }
    }
}
