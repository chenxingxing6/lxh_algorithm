package sort;

/**
 * created by lanxinghua@2dfire.com on 2020/5/18
 * 选择排序
 * 最坏时间复杂度：O(n^2)
 * 最好时机复杂度：O(n)
 */
public class SelectionSort extends BaseSort{
    public static void main(String[] args) {
        insetSort(arr);
    }

    private static void insetSort(int arr[]){
        printArray("排序前", arr);

        // 选择排序的遍历次数
        for(int i =0; i< arr.length ; i++){
            // 选择最小值index
            int minIndex = i;
            for (int j = i+1; j< arr.length; j++){
                // 在剩下数组中找最小值
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // 找到了最小值，进行替换
            if (minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex]  = arr[i];
                arr[i] = temp;
            }
        }

        printArray("排序后", arr);
    }
}
