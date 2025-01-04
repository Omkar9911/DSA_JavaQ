/* Question 9: Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.
#DSA 4
Example 1:
Input: nums = [1, 2, 3, 1]
Output: true
Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true
*/

import java.util.Scanner;

public class q4_contains_dublicate
{
    public static int twice(int number[])
    {
        for(int i=1; i<number.length; i++)
        {
            if(number[0] == number[i])
            {
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array = ");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.print("Enter no of element = ");

        for(int i=0; i<n; i++)
        {
            number[i]=sc.nextInt();
        }

        System.out.print("You Entered no in an array is :");
        // print array
        for(int i=0; i<n; i++)
        {
            System.out.print( number[i]+ " " );
        }
        System.out.println();
        int result = twice(number);
        if(result == 1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}