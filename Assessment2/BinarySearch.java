package BinarySearch;
/*****************************************
 *  This code implements binary search algorithm
 *  BinarySearch returns the location if a match occurs otherwise -(x+1) where x is the no. of elements in the array, 
 *  When value is not present in the array the returned value error message.
 * 
 ****************************************/
 
class BinarySearch 
{
	int array[];
  public static void main(String args[])
  {
	  int search = 32;
	  BinarySearch bs = new BinarySearch();
	  bs.setInputArray(100);
	  bs.binarySearch(search);
  }
  
  /**
   * This method creates array int based on the specified limit.
   */
  public void setInputArray(int limit){
	  array = new int[limit];
	  for (int c = 0; c < limit; c++){
	      array[c] = c;
	  }    
  }
  
  /**
   * This method search a given number in an array using binary search algo.
   * When number found it returns the position of the number or returns -1 when number is not found. 
   */
  public int binarySearch(int search){
    int first, last, middle;
    
    first  = 0;
    last   = array.length - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        return (middle + 1);
      }
      else{
         last = middle - 1;
      }
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
      return -1;
  }
}