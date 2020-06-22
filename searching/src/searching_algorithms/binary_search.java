package searching_algorithms;

public class binary_search 
{
    public static void main(String args[])
    {
        //for binary search sorted array is needed
        int[] arr = {-12, 17, 34, 67, 89, 90};
        System.out.println("-12 found at position : " + binarysearch(arr, -12));
        System.out.println("8889 found at position : " + binarysearch(arr,8889));
    }
    
    public static int binarysearch(int[] arr, int value)
    {
        int start = 0;
        int end = arr.length;
        
        while(start < end)
        {
            int mid = (start + end) / 2;
            //System.out.println("mid: "+mid);
            if(arr[mid] == value)
                return mid;
            
            else if(value < arr[mid])
                end = mid;
            
            else
                start = mid + 1;
        }
        
        return -1;
    }
}
