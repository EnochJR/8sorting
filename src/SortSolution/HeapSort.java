package SortSolution;

public class HeapSort {

   public static void heapSort(int[] nums){
       //构建大顶堆
       for(int i = nums.length/2-1;i>=0;i--){
           adjustHeap(nums,i,nums.length);
       }

       for(int j = nums.length-1;j>0;j--){
           swap(nums,0,j);
           adjustHeap(nums,0,j);
       }


   }



   public static void adjustHeap(int[] arr,int i,int length){
       int temp = arr[i];
       for(int k = i*2+1;k<length;k=k*2+1){
           if(k+1<length&&arr[k]<arr[k+1]){
               k++;
           }
           if(arr[k]>temp){
               arr[i] = arr[k];
               i = k;
           }else{
               break;
         }
       }
       arr[i] = temp;
   }





    /**
     * 交换位置的函数
     * @param a
     * @param i
     * @param j
     */

    public static void swap(int[] a,int i,int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
