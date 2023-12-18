/*
 * Activity 3.6.4
 */

import java.util.Arrays;

public class std
{
  public static void main(String[] args)
  {

    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

    // Compute a Sum and Average (steps 1-2)
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      sum += goals[i];
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (double) sum / goals.length);
    // Determine a Minimum or Maximum Value (steps 3-5)
    int max = goals[0];
    int min = goals[0];
    for(int i = 1; i < goals.length; i++){
        if(goals[i] > max){
            max = goals[i];
        }
        if(goals[i]<min){
            min = goals[i];
        }
    }
    System.out.println("Maximum Value: " + max);
    System.out.println("Minimum Value: " + min); 
    // Compute the Mode (steps 6-11)
    int[] goalCounter = new int[10];
    
    System.out.println(Arrays.toString(goalCounter));
    // Determine if at least one element has a certain property (steps 12-17)
    
    // Determine if all elements have a certain property (steps 18-20)
    
    // Determine the number of elements meeting specific criteria (steps 21-23)
    
    // Access all consecutive pairs of elements (step 24)
    
    // (step 25 and 27)
    
    // (steps 26 and 27)

  }
  
}