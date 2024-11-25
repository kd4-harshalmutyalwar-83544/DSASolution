public class Q4SortColor
{
    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
       arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void sort012(int[] arr) 
    {
    
     int low = 0;
     int mid = 0;
     int high = arr.length-1;
     
     while(mid<=high)
     {
         if(arr[mid]==0)
         {
         swap(arr, mid,low);
         mid++;
         low++;
         }
         else if(arr[mid]==1)
         {
             mid++;
         }
         else
         {
            swap(arr, mid, high);
            high--;
         }
     }
    } 

    public static void main(String args[])
    {
        int arr[] = {0, 1, 2, 0, 1, 2};
        sort012(arr);
    }
}
