boolean palindromeRearranging(String inputString)
{
    char[] inputStringCopy = inputString.toCharArray();
    int[] letterCount = {
                            0,0,0,0,0,0,0,0,0,0,0,0,0,
                            0,0,0,0,0,0,0,0,0,0,0,0,0
                        };
    boolean oddOccured = false;
    int sizeOfInputString = inputString.length();
    
    for(int i = 0; i < sizeOfInputString; i++)
    {
        letterCount[inputStringCopy[i] - 'a'] += 1;
    }

    for(int i = 0; i < 26; i++)
    {
        if( ((letterCount[i] % 2) != 0) && (!oddOccured) )
            oddOccured = true;
        else if( ((letterCount[i] % 2) != 0) && (oddOccured) )
            return false;
    }
    return true;
}
