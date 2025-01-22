// Print sum of all element in an array.


public class Q66SumOfArray 
{
    public static int ArraySum(int arr[])
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
           sum  = sum + arr[i];
        }
        return sum;
    }
   public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = ArraySum(arr);

        System.out.println("Sum of array:" + result);

    }
 
}
