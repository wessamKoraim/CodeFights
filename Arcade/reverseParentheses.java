String reverseParentheses(String s)
{
    StructLikeNewType var1 = new StructLikeNewType();
    int var2 = 0;
    
    var1 = searchForInnerMostParentheses(s);
    
    if(var1.parenthesesExist)
        var2 = searchForComingParentheses(var1.innerMost, s);
    else
        return s;
    
    s = swapBetweenParentheses(var1.innerMost,var2,s);
    s = removeParentheses(var1.innerMost,var2,s);
    
    return reverseParentheses(s);
}

private StructLikeNewType searchForInnerMostParentheses(String s)
{
    StructLikeNewType RetVal = new StructLikeNewType();
    
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

public class StructLikeNewType
{
    int innerMost;
    boolean parenthesesExist;
}
