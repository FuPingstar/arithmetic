package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 直接插入排序（顺序法）
 * 有哨兵
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 13:24
 */
public class Solution07 {
    public static int[] insertSort(int[] arraySource) {
        int[] arr = new int[arraySource.length+1];
        for (int k = 0; k < arraySource.length; k++){
            arr[k+1] = arraySource[k];
        }
        for (int i = 2; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                arr[0] = arr[i];
                int j;
                for (j = i; arr[0] < arr[j-1]; j--){
                    arr[j] = arr[j-1];
                }
                arr[j] = arr[0];
            }
        }
        int[] arr1 = new int[arr.length-1];
        for (int m = 1; m < arr.length; m++){
            arr1[m-1] = arr[m];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] result = insertSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
