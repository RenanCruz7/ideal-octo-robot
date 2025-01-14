package Sorting;

public class Quicksort {

    public void quicksort(int[]arr, int left, int right){
        if (left < right){
            int pivot = partition(arr,left,right);
            quicksort(arr,left,pivot-1);
            quicksort(arr,pivot+1,right);
        }
    }

    public int partition(int[]arr, int left, int right){
        int pivot = arr[right];
        var i = left - 1;
        for (int j = left; j < right; j++){
            if (arr[j] <= pivot){
                i++;
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        var temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }
}
