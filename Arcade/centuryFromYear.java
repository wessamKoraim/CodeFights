int centuryFromYear(int year)
{
    int result=year/100;
    if((year%100)!=0)
        result++;
    return result;
}