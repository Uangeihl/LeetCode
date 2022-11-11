/**
 * 给定一个整数数组 arr，如果它是有效的山脉数组就返回 true，否则返回 false。
 * 让我们回顾一下，如果 arr 满足下述条件，那么它是一个山脉数组：
 * arr.length >= 3
 * 在 0 < i < arr.length - 1 条件下，存在 i 使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 */
public class ValidMountainArray_941 {
    public static boolean validMountainArray(int[] arr) {
//        if (arr.length <= 2) return false;
//        int n = arr.length;
//        int left = 1, right = n - 2;
//        int temp1 = arr[0];
//        while (left < n && arr[left] > temp1) {
//            temp1 = arr[left];
//            left++;
//        }
//        int temp2 = arr[n - 1];
//        while (right >= 0 && arr[right] > temp2) {
//            temp2 = arr[right];
//            right--;
//        }
//        if (left >= n || right < 0) return false;
//        return left - right > 1;
        int n = arr.length;
        if (n < 3) return false;
        int i = 0, j = n - 1;
        while (i < n - 1 && arr[i] < arr[i + 1]) i++;
        while (j > 0 && arr[j] < arr[j - 1]) j--;
        return i == j && i != n - 1 && j != 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(validMountainArray(arr));
    }
}
