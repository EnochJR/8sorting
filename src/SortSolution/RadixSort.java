package SortSolution;

public class RadixSort {

    public static void radixSort(int[] nums){
        int n = 1;
        int k = 0;
        int d =100;
        int length = nums.length;
        int[][] bucket = new int[10][length];
        int[] order = new int[length];
        while(n<d){
            for (int num:nums){
                int digit = (num/n)%10;
                bucket[digit][order[digit]] = num;
                order[digit]++;
            }
            for (int i = 0;i<length;i++){
                if (order[i]!=0){
                    for (int j = 0;j<order[i];j++){
                        nums[k] = bucket[i][j];
                        k++;
                    }
                }
                order[i] = 0;
            }
            n*=10;
            k=0;
        }






    }


}
