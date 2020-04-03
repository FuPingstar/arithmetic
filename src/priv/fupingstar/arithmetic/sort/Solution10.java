package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 15:06
 */
public class Solution10 {
    public static int[] bubbleSort(int[] arraySource){
        int[] arr = Arrays.copyOf(arraySource, arraySource.length);
        for (int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i -1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    public static void main(String[] args) {
        int[] arr = {6,4,5,4,6,4,7,3,0,2,1};
        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
