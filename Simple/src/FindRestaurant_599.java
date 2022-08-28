import java.util.*;

/**
 * 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。
 */
public class FindRestaurant_599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> res = new HashSet<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int min = 2000;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int temp = map.get(list2[i]) + i;
                if (min > temp) {
                    res.clear();
                    min = temp;
                    res.add(list2[i]);
                }
                else if (min == temp) res.add(list2[i]);
            }
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }
}
