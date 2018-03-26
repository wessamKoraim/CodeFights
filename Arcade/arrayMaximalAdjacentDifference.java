int arrayMaximalAdjacentDifference(int[] inputArray) 
{
    int maximumDifference = 0;
    for(int i = 1; i < inputArray.length; i++)
        if(Math.abs(inputArray[i] - inputArray[i-1]) > maximumDifference)
            maximumDifference = Math.abs(inputArray[i] - inputArray[i-1]);
    return maximumDifference;
}