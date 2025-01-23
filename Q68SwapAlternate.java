// Swap Alternate in Array eg:  [5, 2, 9, 4, 7, 6, 1, 0] = [2, 5, 4, 9, 6, 7, 0, 1] = for even
// for odd = [11, 33, 9, 76, 43] = [33, 11, 76, 9, 43]

public class Q68SwapAlternate 
{
    public static void swapAlternate(int arr[], int size)
    {
        for(int i=0; i<size; i+=2)
        {
            if(i+1<size)
            {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            }
        }
    }

    public static void printArray(int arr[], int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int even[] = {5, 2, 9, 4, 7, 6, 1, 0};
        int odd[] = {11, 33, 9, 76, 43};

        swapAlternate(even, 8);
        printArray(even, 8);

        swapAlternate(odd, 5);
        printArray(odd, 5);
    }
}

