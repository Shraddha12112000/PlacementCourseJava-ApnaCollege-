public class Sorting {
    //optimized for sorted array - O(n)
    public static void bubbleSort(int[] arr) {
        //Time complexity = O(n2) 
        //push Larger bubble at end end of the array.
        for (int turn = 0; turn < arr.length - 1; turn++) { //n=5 turn = 0 to 3 = total =4
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swap++;

            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        //pick the smallest(from unsorted),put it at the beginning.
        //Time complexity = O(n2) 
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;

                }
            }
            //swap
            int temp = arr[minPos];//arr[j]
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionSort(int arr[]) {
        //pick an element from unsorted part and push it at right position in sorted part Time Complexity =O(n2)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            //find out correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            //insertion
            arr[prev + 1] = curr;

        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    


    public static void main(String[] args) {
        int arr[] = { 7,0, 3, 3, 5,8,7,8 };
        countingSort(arr);
        printArray(arr);
        //inbuilt sort
        //Arrays.sort(arr); 
        //Arrays.sort(arr,si,ei) ei is non inclusive.
        //Time Complexity=O(nlogn)<O(n2);
        //import java.util.Collections;
        //Arrays.sort(arr,Collections.reverseOrder())
        //Arrays.sort(arr,si,ei,Collections.reverseOrder()) make int to Integer
        //reverseOrder() :- this functions work on objects. internally uses a comparator

        
    }
    
}
