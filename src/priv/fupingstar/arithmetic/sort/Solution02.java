package priv.fupingstar.arithmetic.sort;

/**
 * 希尔排序
 * 最小的k个数
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/20 17:42
 */
public class Solution02 {
    public static int[] getLeastNumbers(int[] arr, int k){
        for (int d = arr.length/2; d > 0; d /= 2){
            for (int i = d; i < arr.length; i++){
                for (int j = i; j - d >= 0; j -=d){
                    if (arr[j] < arr[j-d]){
                        swap(arr, j, j-d);
                    }
                }
            }
        }
        int rst[] = new int[k];
        for (int i = 0; i < k; i++) {
            rst[i] = arr[i];
        }
        return rst;
    }

    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int a[] = new int[]{3,2,1};
        int[] numbers = getLeastNumbers(a, 2);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
