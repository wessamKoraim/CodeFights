String[] allLongestStrings(String[] inputArray) 
{
    int max = 0;
    int index = 0;
    int lengthOfArray = inputArray.length;
    String[] arrayOfStrings = new String[lengthOfArray];
    for(int i = 0; i < lengthOfArray; i++)
    {
        if(max < inputArray[i].length())
        {
            max = inputArray[i].length();
            index = 0;
            arrayOfStrings[index] = inputArray[i];
        }
        else if( max == inputArray[i].length())
        {
            index++;
            arrayOfStrings[index] = inputArray[i];
        }
    }
    String[] RetStr = new String[index+1];
    for(int i = 0; i <= index; i++)
    {
        RetStr[i] = arrayOfStrings[i];
    }
    return RetStr;
}
