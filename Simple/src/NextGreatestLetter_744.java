/**
 * 给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。
 * 在比较时，字母是依序循环出现的。举个例子：
 * 如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a'
 */
public class NextGreatestLetter_744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) return letter;
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }
}
