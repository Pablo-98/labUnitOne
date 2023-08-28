import java.util.Scanner;

public class lab {

    public static void main (String[] args){



        /*Write a program that reads a list of integers and outputs those integers in reverse. 
        The input begins with an integer indicating the number of integers that follow. For coding simplicity, follow each output integer by a comma,
         including the last one. Assume that the list will always contain fewer than 20 integers.

Ex: If the input is:
5 2 4 6  8 10 

output:
10 8 6 4 2 
         * 
         */
       Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed

           System.out.println("you wll now enter the size of the array (num elements) ");

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
     System.out.println("you wll now enter numbers into the array ");

     for(int i = 0; i < numElements; i++) {
        userList[i] = scnr.nextInt();

        }
        System.out.println("-----------------------------");

           for(int i = numElements -1; i >= 0; i--) {
            
        System.out.print(userList[i] + ",");
            

        }
        System.out.println();


     }

   }

    