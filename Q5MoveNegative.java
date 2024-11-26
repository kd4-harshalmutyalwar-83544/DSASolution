public class Q5MoveNegative 
{
    public static void MoveNegative(int arr[])
    {
         int j=0, temp;

         for(int i=0; i<arr.length; i++)
         {
              if(arr[i] < 0)
              {
                if(i!=j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
              }
         }
    }
   public static void main(String args[])
   {
    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    MoveNegative(arr);

    for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
   }    
}
