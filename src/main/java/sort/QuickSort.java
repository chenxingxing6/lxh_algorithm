package sort;

/**
 * created by lanxinghua@2dfire.com on 2020/5/18
 * 快速排序-递归
 *
 * 不稳定算法排序：中枢元素替换时很有可能将前面元素稳定性打乱了
 */
public class QuickSort extends BaseSort{
    public static void main(String[] args) {
        printArray("排序前", arr);
        quickSort(arr, 0, arr.length -1);
        printArray("排序后", arr);
    }

    private static int[] quickSort(int arr[], int low, int high){

        if (low>=high){
            return arr;
        }

        int start = low;
        int end = high;
        int key = arr[low];
        while (start < end){
            // 向后遍历
            while (end > start && arr[end] >= key){ end--; }
            if (arr[end] <= key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            // 向前遍历
            while (end > start && arr[start] <= key){ start++; }
            if (arr[start] >= key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            // 左边部分继续递归
            if (start > low){  quickSort(arr, low, start-1); }
            // 右边部分继续递归
            if (high > end){  quickSort(arr, end + 1, high); }
        }

        return arr;
    }
}
