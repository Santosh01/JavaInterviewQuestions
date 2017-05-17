package source;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample
{
     public static void main(String[] args)
    {
        int key = 77; 
        int[ ] num = new int [5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
        	String n = sc.nextLine();
        	num[ i ]= Integer.parseInt(n); 
        }
        	Arrays.sort(num);
        	binarySearch (num, 0, num.length-1, key);	
        
          
    }
   
 	
   public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key)
   {
       int position;
       int comparisonCount = 1;    


     position = ( lowerbound + upperbound) / 2;

     while((array[position] != key) && (lowerbound <= upperbound))
     {
         comparisonCount++;
         if (array[position] > key)             
         {                                       
              upperbound = position - 1;   
         }                                                             
              else                                                   
        {                                                        
              lowerbound = position + 1;    
        }
       position = (lowerbound + upperbound) / 2;
     }
     if (lowerbound <= upperbound)
     {
           System.out.println("The number was found at index " + position);
           System.out.println("The binary search found after " + comparisonCount +" comparisons.");
 
     }
     else
          System.out.println("Sorry, the number is not in this array.  The binary search made " +comparisonCount  + " comparisons.");
  }

}