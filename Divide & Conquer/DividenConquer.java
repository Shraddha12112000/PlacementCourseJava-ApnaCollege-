import java.util.*;

public class DividenConquer {
    //merge sort
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //work
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid + 1, ei);//right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; //iterator for temp arr
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp arr to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //last element = pivot element
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);//left part
        quickSort(arr, pivotIndex+1, ei);//right part

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;//make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static int search(int A[], int l, int h, int key)
    {
        //base case
        if (l > h) {
            return -1;
        }
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int mid = l + (h - l) / 2;
        //found
        if (A[mid] == key) {
            return mid;
        }
        //mid lies on L1
        if (A[l] <= A[mid]) {
            //case a L1 left part
            if (A[l] <= key && key <= A[mid]) {
                return search(A, l, mid - 1, key);
            } else {
                //case b L1 right
                return search(A, mid + 1, h, key);
            }
        }
        //lies on L2
        else {
            //case a L2 right
            if (A[mid] <= key && key <= A[h]) {
                return search(A, mid + 1, h, key);
            } else {
                return search(A, l, mid - 1, key);
            }
        }
    }
    //Assignment Questions
    //Question 1. Apply Merge sort to sort an array of Strings
    

    public static void main(String[] args) {
        int A[] = { 0, 8, 9, 3, 4, 7};
        //quickSort(arr, 0, arr.length - 1);
        //for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
        //}
        System.out.println(search(A, 0, A.length-1 , 9));
        
    }
}
