int makeArrayConsecutive2(int[] statues) 
{
    int i=0;
    int j=0;
    int sum=0;
    int size=statues.length;
    for(i=1;i<size;i++)
    {
        for(j=i;j<size;j++)
        {
            if(statues[j]>statues[i-1]);
            else
            {
                sum=statues[i-1];
                statues[i-1]=statues[j];
                statues[j]=sum;
            }
        }
    }
    sum=0;
    for(i=1;i<size;i++)
    {
        if(statues[i]==statues[i-1]);
        else
        {
            sum+=(statues[i]-statues[i-1]-1);
        }
    }
    return sum;
}
