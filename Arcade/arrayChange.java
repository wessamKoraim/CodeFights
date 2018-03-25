int arrayChange(int[] inputArray) 
{
    int count = 0;
    int increment = 0;
    int sizeOfinputArray = inputArray.length;
    for(int i = 1; i < sizeOfinputArray; i++)
    {
        if(inputArray[i]<=inputArray[i-1])
        {
            increment = inputArray[i-1] - inputArray[i] + 1;
            count += increment;
            inputArray[i] += increment;
        }
    }
    return count;
}