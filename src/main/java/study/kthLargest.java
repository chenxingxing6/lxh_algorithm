package study;

/**
 * created by lanxinghua@2dfire.com on 2020/6/27
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 */
public class kthLargest {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int kthLargest = findKthLargest(nums, 2);
        System.out.println(kthLargest);
    }
    public static int findKthLargest(int[] nums, int k){
        return sort(nums, 0, nums.length-1, k);
    }

    private static int sort(int[] nums, int left, int right, int k){
        // 基准值
        int base = nums[left];
        int leftIndex = left;
        int rightIndex = right;
        while (leftIndex < rightIndex){
            while (leftIndex < rightIndex && nums[rightIndex] > base){
                rightIndex--;
            }
            if (leftIndex < rightIndex){
                int temp = nums[rightIndex];
                nums[rightIndex] = nums[leftIndex];
                nums[leftIndex] = temp;
                leftIndex++;
            }
            while (leftIndex < rightIndex && nums[leftIndex] < base){
                leftIndex++;
            }
            if (leftIndex < rightIndex){
                int temp = nums[rightIndex];
                nums[rightIndex] = nums[leftIndex];
                nums[leftIndex] = temp;
                rightIndex--;
            }
        }
        int rank = nums.length - leftIndex;
        if (rank == k){
            return nums[leftIndex];
        }else if (rank < k){
            return sort(nums, left, leftIndex -1, k);
        }else {
            return sort(nums, leftIndex+1, right, k);
        }
    }
}
