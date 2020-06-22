package searching_algorithms;

public class linear_search 
{
    
    public static void main(String args[])
    {
        int[] arr = {17, 90, -12, 34, 67, 89};
        System.out.println("89 found at position : " + linearsearch(arr, 89));
        System.out.println("8889 found at position : " + linearsearch(arr,8889));
    }
    
    public static int linearsearch(int[] arr, int value)
    {
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == value)
                return i;
        }
        
        return -1;
    }
    
    
}
