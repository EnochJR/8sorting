package SortSolution;

public class InsertSort {
    /**
     * 直接插入排序，将一个数组分为两部分：
     *                      1：初始元素为数组的第0个元素（一个），每次将待插入的数放进此部分时将此部分排序（含待插入元素）
     *                      2：其他的每个元素都视为待插入的元素。遍历插入第一部分
     *
     * @param nums
     * @return
     */
    public static int[] insertSort(int[] nums){
        int length = nums.length;
        int insertNum,j;
        for(int i = 1;i<length;i++ ){
            insertNum = nums[i];//待插入的数
            j = i-1;
            while(j>=0&&nums[j]>insertNum){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = insertNum;
        }
        return nums;
    }
}
