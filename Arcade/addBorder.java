String[] addBorder(String[] picture) 
{
    int rows = picture.length;
    int cols = picture[0].length();
    int newRows = rows + 2;
    int newCols = cols + 2;
    
    char[][] AllStar = new char[newRows][newCols]; 
    String[] stars = new String[newRows];
    
    for(int i = 0; i < newRows; i++)
    {
        for(int j = 0; j < newCols; j++)
        {
            if((i < 1) || (i > rows) || (j < 1) || (j > cols))
            {
                AllStar[i][j] = '*';
            }
            else
            {
                AllStar[i][j] = picture[i-1].charAt(j-1);
            }
            
        }
    }
    for(int i = 0; i < newRows; i++)
    {
        stars[i] = new String(AllStar[i]);
    }
    
    return stars;
}
