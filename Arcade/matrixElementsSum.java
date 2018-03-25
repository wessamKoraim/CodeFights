int matrixElementsSum(int[][] matrix) 
{
    int i;
    int j;
    int rows = matrix.length;
    int cols = matrix[0].length;
    int totalPrice = 0;
    
    for(j=0;j<cols;j++)
    {
        for(i=0;i<rows;i++)
        {
            if(matrix[i][j]>0)
            {
                totalPrice += matrix[i][j];
            }
            else
            {
                break;
            }
        }
    }
    return totalPrice;
}
