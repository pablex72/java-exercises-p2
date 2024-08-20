public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {21, 59, 5432, 165, 212, 765, 2, 765, 34};
        int target  = 21;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; // might be possible that start + end exceed java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
