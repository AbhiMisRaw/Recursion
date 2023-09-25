import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11,16,10,3,1,7,2,8,3,9,1};
        quickSort(arr,0,arr.length-1);
        System.out.println( "\n Sorted array is " +Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int low, int high){
        if(low < high){
            int partitionIndex = placePivot(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    private static int placePivot(int[] arr, int low, int high) {

        int i = low;
        int j = high ;
        int pivot = arr[low] ; // here we assuming pivot is the first element from the given array
        while(j >= i){
            if(arr[i] > pivot && arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println( "After swapping, array is " + Arrays.toString(arr));
            }else{
                if(arr[i] <= pivot){
                    i++;
                }
                if(arr[j] >= pivot){
                    j--;
                }
            }
        }
        int temp = arr[j];
        arr[j] = pivot ;
        arr[low] = temp ;
        return j ;
    }

}
