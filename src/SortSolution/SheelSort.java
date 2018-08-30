package SortSolution;

public class SheelSort {
    /**
     * 希尔排序（缩减增量排序）：对插入排序的改进，
     * @param nums
     * @return
     */


    public static int[] sheelSort(int[] nums){
        int j;
        for(int gap = nums.length/2;gap>0;gap/=2){
            for(int i =gap;i<nums.length;i++){
                int tmp = nums[i];
                for(j = i;j>=gap&&tmp<nums[j-gap];j-=gap){
                    nums[j] = nums[j-gap];

                }
                nums[j] = tmp;
            }
        }

        return nums;
    }


}