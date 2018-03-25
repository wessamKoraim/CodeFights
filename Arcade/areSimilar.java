boolean areSimilar(int[] a, int[] b)
{
    int lengthOfArray = a.length;
    int[] bCopy = b.clone();
    int swapped = 0;
    int temp;
    int i,j;
    for(i = 0; i < lengthOfArray; i++)
    {
        if( (a[i] != bCopy[i]) && (swapped == 0) )
        {
            for(j = i; j < lengthOfArray-i; j++)
            {
                if( (a[i+j] == bCopy[i]) && (a[i] == bCopy[i+j]) )
                {
                    swapped = 1;
                    temp = bCopy[i];
                    bCopy[i] = bCopy[i+j];
                    bCopy[i+j] = temp;
                    break;
                }
                else if(j == lengthOfArray-i-1)
                    return false;
            }
        }
        else if( (a[i] != bCopy[i]) && (swapped == 1) )
        {
            return false;
        }
    }
    return true;
}