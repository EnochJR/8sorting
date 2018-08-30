package SortSolution;

public class MergeSort {
    public static void  mergeSort(int[] nums){
         int[] temp = new int[nums.length];
         sort(nums,0,nums.length-1,temp);
    }

    public static void sort(int[] nums,int left,int right,int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(nums,left,mid,temp);
            sort(nums,mid+1,right,temp);
            merge(nums,left,mid,right,temp);

        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
