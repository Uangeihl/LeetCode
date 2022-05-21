import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class IsValid_20 {
    public static boolean isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('(', 1);
        map.put(')', -1);
        map.put('[', 2);
        map.put(']', -2);
        map.put('{', 3);
        map.put('}', -3);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && map.get(stack.peek()) + map.get(s.charAt(i)) == 0) {
                stack.pop();
            } else if (map.get(s.charAt(i)) > 0) {
                stack.push(s.charAt(i));
            } else return false;
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));
    }
}
