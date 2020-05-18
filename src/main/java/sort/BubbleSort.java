package sort;


/**
 * created by lanxinghua@2dfire.com on 2020/5/18
 * 冒泡排序
 * 最坏时间复杂度：O(n^2)
 * 最好时间复杂度：O(n)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {20, 10, 30, 15};
        bubbleSort(arr);
    }


    public static void bubbleSort(int arr[]) {
        printArray("排序前", arr);

        // 排序的趟数
        for (int i = 0; i < arr.length; i++) {
            // 每趟需要执行次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArray("排序后", arr);
    }


    private static void printArray(String msg, int arr[]) {
        System.out.print(msg + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
        System.out.println();
    }
}