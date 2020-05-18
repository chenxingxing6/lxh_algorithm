package search;

/**
 * created by lanxinghua@2dfire.com on 2020/5/18
 * 二分查找算法 O(logn)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3,4,5,20,30};
        System.out.println(binarySearch(arr, 20));
    }

    private static int binarySearch(int[] arr, int a){
        int low,high,mid;
        low = 0;
        high = arr.length -1;
        while (low <= high){
            mid = (low + high) / 2;
            if (arr[mid] == a){
                return mid;
            }
            // 向左查找
            else if (arr[mid] > a){
                high = mid -1;
            }

            // 向右查找
            else if (arr[mid] < a){
                low = mid + 1;
            }
        }
        return a;
    }
}
