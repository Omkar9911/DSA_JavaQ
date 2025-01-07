package Array;// Q1. Maximum and minimum of an array using Sorting:
//  #DSA 1
// Algorithm:

// 1.Initialize an array.
// 2.Sort the array in ascending order.
// 3.The first element of the array will be the minimum element.
// 4.The last element of the array will be the maximum element.
// 5.Print the minimum and maximum element.

import java.util.Scanner;
public class q1_max_min_element
{
    public static void maxmin(int number[])
    {
        for(int i=0; i<number.length; i++)
        {
            for(int j=0; j<number.length-1-i; j++)
            {
                if(number[j] > number[j+1])
                {
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
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
        maxmin(number);
        System.out.println("Min element is : " + number[0]);
        System.out.println("Max element is : " + number[n-1]);
    }

}