int commonCharacterCount(String s1, String s2)
{   
    StringBuilder s1Copy = new StringBuilder(s1);
    StringBuilder s2Copy = new StringBuilder(s2);
    int i = 0;
    int j = 0;
    int n1 = s1.length();
    int n2 = s2.length();
    int count = 0;
    
    for(i = 0; i < n1; i++)
        for(j = 0; j < n2; j++)
        {
            if(s1Copy.charAt(i)==s2Copy.charAt(j))
            {
                s2Copy.setCharAt(j,'\0');
                count++;
                break;
            }
        }
    return count;
}
