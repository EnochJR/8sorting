package SortSolution;



public class BubbleSort {

    /**
     * 冒泡排序
     * 首先比较相邻的两个元素 nums[i]?nums[i+1] ,循环比较直到最大者移到最右边，此为一个循环，次数为i
     * 完成一个小循环循环次数-1，
     * @param nums
     * @return
     */
    public static int[] bubble(int[] nums){
        int temp = 0;
        int size = nums.length;
        for(int i = 0 ;i<size-1;i++){
            for(int j = 0 ;j<size -1 - i;j++){
                if(nums[j+1]<nums[j]){
                    temp = nums[j];
                    nums[j] =  nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
     return nums;
    }
}
