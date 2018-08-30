import SortSolution.*;

public class Main {


    public static void main(String[] args) {

        int[] bubble = {5454,556,621,321,548,44,55,66};
        int[] radix = {73,22, 93, 43, 55, 14, 28, 65, 39, 81};
        // int[] sortbubble = BubbleSort.bubble(bubble);
        // int[] insert = InsertSort.insertSort(bubble);
        //  int[] sheel = SheelSort.sheelSort(bubble);
        //  HeapSort.heapSort(bubble);
        // MergeSort.mergeSort(bubble);
        // SelectSort.selectSort(bubble);
        //RadixSort.radixSort(bubble);
        QuickSort.quickSort(bubble,0,bubble.length-1);
        RadixSort.radixSort(radix);
        for(int i = 0 ;i<radix.length;i++){
           System.out.print(radix[i]+"-");
        }


    }
}
