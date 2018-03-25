String reverseParentheses(String s)
{
    InnerMostParentheses checkInnerMostParentheses = new InnerMostParentheses();
    int checkComingParentheses = 0;
    
    checkInnerMostParentheses = searchForInnerMostParentheses(s);
    
    if(checkInnerMostParentheses.parenthesesExist)
        checkComingParentheses = searchForComingParentheses(checkInnerMostParentheses.innerMost, s);
    else
        return s;
    
    s = swapBetweenParentheses(checkInnerMostParentheses.innerMost,checkComingParentheses,s);
    s = removeParentheses(checkInnerMostParentheses.innerMost,checkComingParentheses,s);
    
    return reverseParentheses(s);
}

private InnerMostParentheses searchForInnerMostParentheses(String s)
{
    InnerMostParentheses RetVal = new InnerMostParentheses();
    
    RetVal.innerMost = 0;
    RetVal.parenthesesExist = false;
    
    for(int i = 0; i < s.length(); i++)
        if(s.charAt(i) == '(')
        {
            RetVal.innerMost = i;
            RetVal.parenthesesExist = true;
        }
    return RetVal; 
}

private int searchForComingParentheses(int n, String s)
{
    for(int i = n; i < s.length(); i++)
        if(s.charAt(i) == ')')
            return i;
    return -1;
}

private String swapBetweenParentheses(int left, int right, String s)
{
    StringBuilder sCopy = new StringBuilder(s);
    char temp;
    int j = right-1;
    int difference = right - left;
    for(int i = left+1; i < (right-difference/2); i++)
    {
        temp = sCopy.charAt(j);
        sCopy.setCharAt(j,sCopy.charAt(i));
        sCopy.setCharAt(i,temp);
        j--;
    }
    return sCopy.toString();
}

private String removeParentheses(int left, int right, String s)
{
    return (s.substring(0,left)+s.substring(left+1,right)+s.substring(right+1));
}

public class InnerMostParentheses
{
    int innerMost;
    boolean parenthesesExist;
}
