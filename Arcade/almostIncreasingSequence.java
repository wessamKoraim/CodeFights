boolean almostIncreasingSequence(int[] sequence) 
{
      int i;
      int firstTry = 0;
      int secondTry = 0;
      int indexOfBreakingElement = 0;
      int sizeOfSequence = sequence.length;
      int[] newFixedArray = new int[sizeOfSequence - 1];
      for(i = 0; i < sizeOfSequence-1; i++)
      {
            if(sequence[i] >= sequence[i+1])
            {
                  indexOfBreakingElement = i+1;
                  firstTry = 1;
                  break;
            }
      }
      
      if(firstTry==1)
      {
            for(i = 0; i < indexOfBreakingElement; i++)
            {
                  newFixedArray[i] = sequence[i];  
            }
            for(i = indexOfBreakingElement+1; i < sizeOfSequence; i++)
            {
                  newFixedArray[i-1] = sequence[i]; 
            }
      }
      
      for(i = 0; i < sizeOfSequence-2; i++)
      {
            if(newFixedArray[i] >= newFixedArray[i+1])
            {
                  indexOfBreakingElement = i;
                  secondTry = 1;
                  break;
            }
      }
      
      if(secondTry==1)
      {
            for(i = indexOfBreakingElement+1; i < sizeOfSequence; i++)
            {
                  newFixedArray[i-1] = sequence[i]; 
            }
      }
      
      for(i = 0; i < sizeOfSequence-2; i++)
      {
            if(newFixedArray[i] >= newFixedArray[i+1])
            {
                  return false;
            }
      }
      return true;
}
