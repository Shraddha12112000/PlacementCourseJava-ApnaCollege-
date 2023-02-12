import java.util.*;
public class Arrays {
    //List of elements of same data type placed at contiguous memory location.
    //Operations in Array 
    //1. Create
    public static void createArray(int size){
        int arr[] = new int[size];
    }
    //2. Input
    public static void inputArray(String[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
    }
    //3. Output
    public static void outputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    //4. Update
    public static void updateArray(int arr[], int choice) {
        // choice=1 do addition 
        // choice=2 do subtraction
        // choice=3 do multiplication
        // choice=4 do division
        System.out.println("Enter number with which you want to update : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (choice == 1) {
                arr[i] = arr[i] + number;
            }
            if (choice == 2) {
                arr[i] = arr[i] - number;
            }
            if (choice == 3) {
                arr[i] = arr[i] * number;
            }
            if (choice == 4) {
                arr[i] = arr[i] / number;
            }
        }

    }

    public static int linearSearch(int arr[], int key) {
        //Time Complexity = O(n), Space Complexity = O(1)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearS(String arr[], String key) {
        //Time Complexity = O(n), Space Complexity = O(1)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int largestElement(int arr[]) {
        //Time Complexity = O(n), Space Complexity = O(1)
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestElement(int arr[]) {
        //Time Complexity = O(n), Space Complexity = O(1)
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int binarySearch(int arr[], int key) {
        //Time Complexity = O(logn), Space Complexity= O(1)
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = (end + start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static int kadanes(int numbers[]) {
        int cs = 0;
        //special case
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count++;
            } else {
                break;
            }
        }
        if (count==numbers.length) {
            return largestElement(numbers);
        }
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        return ms;
    }

    public static void reverseArray(int arr[]) {
        //Time Complexity =O(n),Space Complexity O(1)
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void pairsInArray(int arr[]) {
        //Time Complexity = O(n^2), Space Complexity = O(1) 
        int totalPairs = 0;
        //formula of total pairs =n(n-1)/2
        for (int i = 0; i <= arr.length - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalPairs++;

            }
            System.out.println();

        }
        System.out.println("Total pairs :- " + totalPairs);

    }

    //public static int[] twoSum(int[] nums, int target) {
    //}

    public static void printSubarrays(int numbers[]) {
        // Time Complexity = O(n^3) , Space Complexity = O(1)
        // Formula For Total Subarrays = n(n+1)/2
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " "); //subarray }
                    System.out.println();
                    System.out.println(sum);
                    if (largest < sum) {
                        largest = sum;
                    }
                    if (smallest > sum) {
                        smallest = sum;
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Largest Subarray Sum: " + largest);
            System.out.println("Smallest Subarray Sum: " + smallest);
        }

    }

    public static void prefixArrayApproach(int numbers[]) {
        //Time complexity = O(n^2)
        int[] prefix = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int currSum = 0;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.print(maxSum);
    }



    public static void main(String args[]) {
        //Creating an array
        //int marks[] = new int[50];
        //int numbers[] = { 2, 6, 9 };
        //Input for array
        //Scanner sc = new Scanner(System.in);
        //marks[0]=sc.nextInt();
        //marks[1]=sc.nextInt();
        //marks[2]=sc.nextInt();
        //Output for array
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //update array
        //marks[1] = 100;
        //System.out.println(marks[1]);
        //int arr[] = new int[5];
        //inputArray(arr);
        //outputArray(arr);
        //updateArray(arr, 1);
        //outputArray(arr);
        //String arr[] = { "Dosa", "Poha", "Vada Pav", "Samosa" };
        //System.out.println("Enter Key To Find : ");
        //String key = sc.nextLine();
        //int index = linearS(arr, key);
        //if (index == -1) {
        //  System.out.println("Not Found");
        //} else{
        //  System.out.println("Found Key At Index : " + index);
        //}
        //int arr[] = { 2,5,4,6,8,10};
        //int index = binarySearch(arr, 0);
        //if (index == -1) {
        //  System.out.println("Not Found");
        //} else {
        //  System.out.println("Key Found At Index : " + index);
        //}
        //reverseArray(arr);
        //outputArray(arr);
        //pairsInArray(arr);
        //int[] nums = {2,7,11,15};
        //int target = 9;
        //System.out.println(twoSum(nums, target));
        int[] numbers = { -1, -2, -3, -4, -5 };
        int maxSubSum = kadanes(numbers);
        System.out.print(maxSubSum);
        //prefixArrayApproach(numbers);
        //printSubarrays(numbers);

    }
}
