import java.util.*;

public class Heapsort    
{           
  public static void main(String [] args)      
  {         // Create and display an array of random integers         
    Random randy = new Random();         
    int [ ] arr = new int[20];        
    System.out.println("Here is the array to be sorted:");         
    for (int k = 0 ; k < arr.length; k++)         
    {             arr[k] = randy.nextInt();                
      System.out.print(arr[k] + "  ");         
    }         
// Create a priority queue of integers         
// and use it to sort the array         
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();                
    for (int x : arr) 
      pQueue.add(x);        
    for (int k = 0; k < arr.length; k++)  
      arr[k] = pQueue.poll();
    
    // Print the array         
    System.out.println("\nHere is the sorted array:");         
    for (int x : arr) System.out.print(x + "  ");              
  }      
}
