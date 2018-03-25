int[] sortByHeight(int[] a)
{
    int count = 0;
    int temp;
    
    for(int i : a) 
        if(i == -1) 
            count++;
    
    int[] n = new int[a.length - count];
    
    count = 0;
    
    for(int i = 0; i < a.length; i++)
        if(a[i] > -1)
        {
            n[count] = a[i];
            count++;
        }
    
    Arrays.sort(n);
    
    count = 0;
    for(int i = 0; i < a.length; i++)
        if(a[i] > -1)
        {
            a[i] = n[count];
            count++;
        }
    return a;
}
