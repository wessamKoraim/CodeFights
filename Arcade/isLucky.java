boolean isLucky(int n) 
{
    int numberOfDigits = countNumberOfDigits(n);
    int[] sum = sum(n,numberOfDigits);
    if(sum[0] == sum[1])
        return true;
    else
        return false;
}

public static int countNumberOfDigits(int n)
{
    int count = 0;
    while(n>0)
    {
        n /= 10;
        count++;
    }
    return count;
}


public static int[] sum(int n, int length)
{
    int sum = 0;
    int[] RetVal = {0,0};
    int i;
    for(i = 0; i < length/2; i++)
    {
        RetVal[0] += (n%10);
        n /= 10;
    }

    for(i = 0; i < length/2; i++)
    {
        RetVal[1] += (n%10);
        n /= 10;  
    }
    return RetVal;
}



