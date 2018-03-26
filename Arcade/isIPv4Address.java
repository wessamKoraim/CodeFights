boolean isIPv4Address(String inputString) 
{
    int sizeOfinputString = inputString.length();
    int dotsCount = 0;
    int[] digitsCount = {0,0,0,0};
    int[] numberIndex = {0,0,0,0};
    if( (inputString.charAt(0) == '.') || (inputString.charAt(sizeOfinputString-1) == '.') )
        return false;
    for(int i = 0; i < sizeOfinputString; i++)
        if( inputString.charAt(i) == '.' )
        {
            dotsCount++;
            if( inputString.charAt(i+1) == '.' )
                return false;
        }
        else if( !Character.isDigit(inputString.charAt(i)) )
            return false;
    if(dotsCount!=3)
        return false;
    
    dotsCount = 0;
    
    for(int i = 0; i < sizeOfinputString; i++)
        if( inputString.charAt(i) == '.' )
        {
            dotsCount++;
            numberIndex[dotsCount] = i+1;
        }
        else if(digitsCount[dotsCount] > 3)
            return false;
        else
            digitsCount[dotsCount]++;
    
    for(int i = 0; i < 4; i++)
        if(digitsCount[i] == 3)
            if(inputString.charAt(numberIndex[i]) > '2')
                return false;
            else if( (inputString.charAt(numberIndex[i]) == '2') && (inputString.charAt(numberIndex[i]+2) > '5') )
                return false;
    
    return true;
}