package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 直接插入排序（顺序法）
 * 无哨兵
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 13:14
 */
public class Solution06 {

    public static int[] insertSort(int[] arraySource) {
        int[] arr = Arrays.copyOf(arraySource, arraySource.length);
        for (int i =1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                int temp = arr[i], j = i;
                for (j = i; j > 0 && arr[j-1] > temp; j--){
                    arr[j] = arr[j-1];
                }
                arr[j] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] result = insertSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
