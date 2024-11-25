public class Q3KthSmallest 
{
        public static int kthSmallest(int[] arr, int k)
        {
            for(int i=0; i<arr.length-1; i++)
            {
                for(int j=i+1; j<arr.length; j++)
                if(arr[i]>arr[j])
                {
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
            int min = arr[k-1];
            return min;
        }

        public static void main(String args[])
        {
            int arr[] = {7, 10, 4, 3, 20, 15};
            int k = 3;

            int result = kthSmallest(arr, k);

            System.out.println("Kth Smallest element is:"+result);
        }
}
