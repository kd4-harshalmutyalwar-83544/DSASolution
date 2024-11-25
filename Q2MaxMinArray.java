public class Q2MaxMinArray
{
    public static void maxInArray(int arr[])
    {
        int max = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(max< arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Max element in an array:"+ max);

        
    }


    public static void minInArray(int arr[])
    {
        int min = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Min element in an array:"+ min);
    }

    public static void main(String args[])
    {
        int arr[] = {22, 14, 8, 17, 35, 3};

        maxInArray(arr);
        minInArray(arr);
    }
}