package SortSolution;

public class SelectSort {
    /**
     * 简单选择排序：将第一个元素与余下元素比较，如第一个元素不是最小，交换位置，
     * 以此类推，换第二个元素与其余元素比较。
     * @param nums
     */

    public static void selectSort(int[] nums){
        int temp,j;
        for(int i = 0;i<nums.length;i++){
            for(j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }

        }


    }
}
