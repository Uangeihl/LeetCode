import java.util.*;

/**
 * 句子 是一串由空格分隔的单词。每个 单词 仅由小写字母组成。
 * 如果某个单词在其中一个句子中恰好出现一次，在另一个句子中却 没有出现 ，那么这个单词就是 不常见的 。
 * 给你两个 句子 s1 和 s2 ，返回所有 不常用单词 的列表。返回列表中单词可以按 任意顺序 组织。
 */
public class UncommonFromSentences_884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for (String s : str1) {
            if (map.containsKey(s)) map.put(s, 2);
            else map.put(s, 1);
        }
        for (String s : str2) {
            if (map.containsKey(s)) map.put(s, 2);
            else map.put(s, 1);
        }
        for (String s : map.keySet()) {
            if (map.get(s) == 1) res.add(s);
        }
        return res.toArray(new String[0]);
    }
}
