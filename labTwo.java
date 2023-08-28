import java.util.Scanner;


/*Given a sorted list of integers, output the middle integer.
 A negative number indicates the end of the input (the negative number is not a part of the sorted list).
  Assume the number of integers is always odd.

Ex: If the input is:

2 3 4 8 11 -1 
the output is:

Middle item: 4
The maximum number of list values for any test case should not exceed 9. If exceeded, output "Too many numbers".

Hint: First read the data into an array. Then, based on the array's size, find the middle item */
public class labTwo {

    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int length =  scnr.nextInt();
      int[] userValues = new int[length];  // Set of data specified by the user      

      

    System.out.println("--------populate array-------");
      for(int i =0; i < userValues.length; i++) {
        
        userValues[i] = scnr.nextInt();
        if (userValues[i] < 0) {
            break;
        }
     
      }

      for (int j = 0; j < userValues.length; j++){
        System.out.println(userValues[j]);
      }
     
      
   }
}
