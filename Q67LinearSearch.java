// Linear Search

public class Q67LinearSearch 
{
    public static int linearSearch(int arr[], int k)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(k == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
    int arr[] = { 2, 4, 6, 1, 9};
    int k=15;

   int result=  linearSearch(arr, k);
   
   if(result >=0)
   {
    System.out.println("Element found at index:" + result);
   }
   else
   {
    System.out.println("Element not found");
   }
   
}
    
}
