package sort;

/**
 * created by lanxinghua@2dfire.com on 2020/5/18
 */
public class BaseSort {
    public static int arr[] = {20, 10, 30, 15};


    protected static void printArray(String msg, int arr[]) {
        System.out.print(msg + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
        System.out.println();
    }
}
