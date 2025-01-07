// Q2. Write a program to reverse an array
//  #DSA 1
// Algorithm:

// 1) Initialize start and end indexes as start = 0, end = n-1
// 2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
// start = start +1, end = end – 1

package Array;
import java.util.Scanner;
public class q2_reverse_array
{
    public static void reverse(int number[])
    {
        int start = 0;
        int end = number.length-1;
        for(int i=0; i<number.length; i++)
        {
            while( start < end){
                int temp = number[start];
                number[start] = number[end];
                number[end] = temp;

                start++;
                end--;

            }
        }
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String[] args)
    {
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
        reverse(number);

    }
}