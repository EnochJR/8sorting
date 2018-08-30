package SortSolution;

public class QuickSort {
    /**
     * 快速排序算法
     * @param nums
     * @return
     */


    public static void quickSort(int[] nums,int left,int right){
       if (left>=right) return;

       int l = left,r = right;
       int index = nums[l];
       while(l<r){
           while(l<r&&nums[r]>=index)
               r--;
           if (l<r)
               nums[l++] = nums[r];
           while(l<r&&nums[l]<index)
               l++;
           if (l<r)
               nums[r--] = nums[l];
       }

       nums[l] = index;
       quickSort(nums,left,l-1);
       quickSort(nums,l+1,right);




    }
}
