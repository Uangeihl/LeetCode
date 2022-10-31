import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 爱丽丝和鲍勃拥有不同总数量的糖果。给你两个数组 aliceSizes 和 bobSizes ，aliceSizes[i] 是爱丽丝拥有的第 i 盒糖果中的糖果数量，bobSizes[j] 是鲍勃拥有的第 j 盒糖果中的糖果数量。
 * 两人想要互相交换一盒糖果，这样在交换之后，他们就可以拥有相同总数量的糖果。一个人拥有的糖果总数量是他们每盒糖果数量的总和。
 * 返回一个整数数组 answer，其中 answer[0] 是爱丽丝必须交换的糖果盒中的糖果的数目，answer[1] 是鲍勃必须交换的糖果盒中的糖果的数目。如果存在多个答案，你可以返回其中 任何一个 。题目测试用例保证存在与输入对应的答案。
 */
public class FairCandySwap_888 {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int alice = 0, bob = 0;
        for (int aliceSize : aliceSizes) {
            alice += aliceSize;
        }
        for (int bobSize : bobSizes) {
            bob += bobSize;
        }
        for (int bobSize : bobSizes) {
            set.add(bobSize);
        }
        for (int aliceSize : aliceSizes) {
            int bobSize = (bob - alice + 2 * aliceSize) / 2;
            if (set.contains(bobSize)) {
                res[0] = aliceSize;
                res[1] = bobSize;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] alice = {1, 1};
        int[] bob = {2, 2};
        System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
    }
}
