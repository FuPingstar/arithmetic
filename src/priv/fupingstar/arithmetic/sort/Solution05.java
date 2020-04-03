package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/27 16:15
 */
public class Solution05 {

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r){
            int temp = arr[l];
            int i = l, j = r;
            while (i < j){
                while (i < j && arr[j] >= temp ){
                    j--;
                }
                if (i < j){
                    arr[i++] = arr[j];
                }
                while (i < j && arr[i] <= temp){
                    i++;
                }
                if (i < j){
                    arr[j--] = arr[i];
                }
            }
            arr[i] = temp;
            quickSort(arr, l, i-1);
            quickSort(arr, i+1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
