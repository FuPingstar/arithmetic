package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 折半插入排序
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 13:45
 */
public class Solution08 {

    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int high = i- 1, low = 0, mid;
            while (low <= high && low >= 0){
                mid = (low + high)/2;
                if (temp > arr[mid]){
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
            int j;
            for (j = i; j > high + 1; j--){
                arr[j] = arr[j-1];
            }
            arr[high+1] = temp;

        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
