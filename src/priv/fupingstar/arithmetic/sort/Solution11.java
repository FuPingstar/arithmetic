package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 简单选择排序
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 15:46
 */
public class Solution11 {
    public static void swapSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            int k = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr [k]){
                    k = j;
                }
            }
            if (k != i)
            {
                swap(arr, i , k);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public static void main(String[] args) {
        int[] arr = {6,4,5,4,6,4,7,3,0,2,1};
        swapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
