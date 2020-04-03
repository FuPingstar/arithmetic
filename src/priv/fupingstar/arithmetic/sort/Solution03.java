package priv.fupingstar.arithmetic.sort;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/26 18:23
 */
public class Solution03 {

    /**
     * 排序
     * @return void
     */
    public static void sort(int[] arr){

        // 1. 初始化大顶堆
        for (int i = arr.length/2-1; i >= 0; i--){
            // 从第一个非叶子结点从下至上，总右至左调整结构
            adjustHeap(arr, i, arr.length);
        }
        // 2. 堆调整并且交换根结点和最后一个叶子结点
        for (int j = arr.length-1; j > 0; j--){
            swap(arr, 0,j);
            adjustHeap(arr, 0 ,j);
        }
    }

    /**
     * 调整大顶堆
     *
     * @param arr
     * @param i
     * @param length
     * @return void
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        // 先取出当前节点的值
        int temp = arr[i];
        // 从i结点的左叶子结点开始
        for (int j = i*2+1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && arr[j] < arr[j + 1]) {
                j++;
            }
            if (arr[j] > temp){
                arr[i] = arr[j];
                i = j;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }

    /**
     * 交换数组元素
     * @param arr
     * @param i
     * @param j
     * @return void
     */
    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2,45,10,26,0001,45,100,99,85,45,5,4,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
