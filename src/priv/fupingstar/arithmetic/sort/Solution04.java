package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 子序列已经排好序
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/26 20:37
 */
public class Solution04 {

    /**
     * 进行归并排序
     * @param sourceArr
     * @return int[]
     */
    public static int[] sort(int[] sourceArr){
        // 不改变参数内容，对arr进行拷贝
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);
        if (arr.length < 2){
            return arr;
        }
        int middle = (int) Math.floor(arr.length/2);
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        int[] result = merge(left, right);
        return result;
    }

    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0;
        while(left.length > 0 && right.length > 0){
            if (left[0] < right[0]){
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            }else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while (left.length > 0){
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0){
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,9,8,10,15};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
