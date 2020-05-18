package sort;

/**
 * created by lanxinghua@2dfire.com on 2020/5/18
 * 插入排序
 * 最坏时间复杂度 O(n^2)
 * 最优时间复杂度 O(n)
 *
 */
public class InsertionSort extends BaseSort{
    public static void main(String[] args) {
        insertSort(arr);
    }

    public static void insertSort(int arr[]){
        printArray("排序前", arr);

        for (int i = 1; i< arr.length; i++){
           for (int j = i; j>0&&(arr[j] < arr[j-1]); j--){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
           }
        }

        printArray("排序后", arr);

    }
}
