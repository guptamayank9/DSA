import java.util.Arrays;

public class SearchAlgorithms {

    public static int linearSearchRecursive(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return linearSearchRecursive(arr, key, index + 1);
    }

    public static int linearSearchNonRecursive(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearchRecursive(arr, key, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, key, mid + 1, high);
        }
    }

    public static int binarySearchNonRecursive(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 50;

        int indexRecursive = linearSearchRecursive(arr, key, 0);
        System.out.println("Linear Search (Recursive) Index: " + (indexRecursive != -1 ? indexRecursive : "Not Found"));

        int indexNonRecursive = linearSearchNonRecursive(arr, key);
        System.out.println("Linear Search (Non-Recursive) Index: " + (indexNonRecursive != -1 ? indexNonRecursive : "Not Found"));

        int indexBinaryRecursive = binarySearchRecursive(arr, key, 0, arr.length - 1);
        System.out.println("Binary Search (Recursive) Index: " + (indexBinaryRecursive != -1 ? indexBinaryRecursive : "Not Found"));

        int indexBinaryNonRecursive = binarySearchNonRecursive(arr, key);
        System.out.println("Binary Search (Non-Recursive) Index: " + (indexBinaryNonRecursive != -1 ? indexBinaryNonRecursive : "Not Found"));
    }
}

