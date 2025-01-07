
// Q 3 Max SubArray sum
/*
Example 1:

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.
        Example 2:

        Input: nums = [1]
        Output: 1
        Explanation: The subarray [1] has the largest sum 1.
        Example 3:

        Input: nums = [5,4,-1,7,8]
        Output: 23
        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.*/

package Array;
import java.util.Scanner;
public class q3_Max_subArray_Sum
{
    public static void maxSubarraySum(int number[])
    {
        int currsum = 0;
        int  maxsum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++)
        {
            int start = i;
            for(int j=i; j<=number.length; j++)
            {
                currsum = 0;
                int end = j;

                for(int k=start; k<end; k++)
                {
                    currsum = currsum + number[k];

                }
                System.out.print(currsum);
                if(maxsum < currsum)
                {
                    maxsum = currsum;
                }
                System.out.println();

            }
        }
        System.out.println("Max sum = " + maxsum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        int number[] = new int[n];

        System.out.println("Enter no of element = ");

        for(int i=0; i<n; i++)
        {
            number[i]=sc.nextInt();
        }

        System.out.println("You Entered no in an array is :");
        // print array
        for(int i=0; i<n; i++)
        {
            System.out.print( number[i]+ " " );
        }
        System.out.println();

        maxSubarraySum(number);


    }


}
