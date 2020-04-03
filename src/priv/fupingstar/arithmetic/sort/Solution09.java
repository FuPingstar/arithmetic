package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 移动法
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 14:49
 */
public class Solution09 {
    public static int[] shellSort(int[] arraySource){
        int[] arr = Arrays.copyOf(arraySource, arraySource.length);
        // 依次减小增量
        for (int d = arr.length/2; d > 0; d /= 2){
            for (int i = d; i < arr.length; i++) {
                int j, temp = arr[i];
                for (j = i; j - d >= 0 && arr[j-d] > temp; j -= d){
                    arr[j] = arr[j-d];
                }
                arr [j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] result = shellSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
