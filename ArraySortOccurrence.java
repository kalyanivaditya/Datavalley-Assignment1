import java.util.Arrays;
import java.util.Scanner;

public class ArraySortOccurrence {
    
    // Function to sort the array using QuickSort algorithm
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    // Helper function for partitioning in QuickSort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    // Function to find the number of occurrences of a particular number in the array
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Number to find occurrences
        System.out.print("Enter the number to find occurrences: ");
        int numberToFind = scanner.nextInt();
        
        scanner.close();
        
        // Sort the array
        quickSort(array, 0, array.length - 1);
        
        // Find the number of occurrences of a particular number
        int occurrences = countOccurrences(array, numberToFind);
        
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }
}
