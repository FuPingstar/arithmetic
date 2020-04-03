package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 按奇偶排序数组
 * 将数组的偶数都排在前面，基数都排在后面
 * 快速排序的思想，java双指针
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/28 16:38
 */
public class Solution12 {

    public static void sort(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < j){
            while (i < j && arr[i] % 2 == 0){
                i++;
            }
            while (i < j && arr[j] % 2 == 1){
                j--;
            }
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
