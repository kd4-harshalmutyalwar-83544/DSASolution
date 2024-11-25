public class ReverseArray
{

    public static void ReverseArray(int arr[])
    {
        if(arr.length == 0 || arr == null)
        {
            System.out.println("Array is empty or null");
        return;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }

    public static void printArray(int arr[])
    {
        if(arr == null  || arr.length == 0)
        {
            System.out.println("Array is empty or null");
            return;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr1[] = {1, 4, 3, 2, 6, 5};

         ReverseArray(arr1);

         printArray(arr1);


        int arr2[] = {4, 5, 1, 2};

        ReverseArray(arr2);

         printArray(arr2);

        // empty array 
         int arr3[] = {};

        ReverseArray(arr3);

         printArray(arr3);

    }
}