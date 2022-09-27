import java.util.*;

/**
 * 给你一个由若干单词组成的句子 sentence ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。
 * 请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。山羊拉丁文的规则如下：
 * 如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
 * 例如，单词 "apple" 变为 "applema" 。
 * 如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词 "goat" 变为 "oatgma" 。
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
 * 例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。
 * 返回将 sentence 转换为山羊拉丁文后的句子。
 */
public class ToGoatLatin_824 {
    public static String toGoatLatin(String sentence) {
        /*Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        String[] res = sentence.split(" ");
        for (int i = 0; i < res.length; i++) {
            if (set.contains(res[i].charAt(0))) res[i] += "ma";
            else res[i] = res[i].substring(1) + res[i].charAt(0) + "ma";
            for (int j = 0; j <= i; j++) {
                res[i] += "a";
            }
        }
        return Arrays.toString(res).replace(",", "").replace("[", "").replace("]", "");*/
        List<Character> list = new ArrayList(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String[] splited = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int index = 0; index < splited.length; index++) {
            char temp = Character.toLowerCase(splited[index].charAt(0));
            if (list.contains(temp)) {
                sb.append(splited[index]);
            } else {
                sb.append(splited[index].substring(1));
                sb.append(splited[index], 0, 1);
            }
            sb.append("ma");
            for (int i = 0; i < count; i++) {
                sb.append("a");
            }
            count++;
            if (index < splited.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
}
