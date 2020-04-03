package priv.fupingstar.arithmetic.bit;

/**
 * 位运算
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/29 22:58
 */
public class Solution01 {
    public static void main(String[] args) {
        // 左移运算
        System.out.println(2 << 1);
        // 右移运算
        System.out.println(5 >> 2);

        // 无符号右移
        System.out.println(-5 >>> 2 );

        // 位与操作
        System.out.println(5 & 3);

        // 位或操作
        System.out.println(5 | 3);

        // 位异或操作
        System.out.println(5 ^ 3);

        // 位非操作
        System.out.println(~5);
    }
}
