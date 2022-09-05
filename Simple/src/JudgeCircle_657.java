/**
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 * 移动顺序由字符串 moves 表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 * 如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 */
public class JudgeCircle_657 {
    public static boolean judgeCircle(String moves) {
        int[] arr = new int[4];
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'R':
                    arr[0]++;
                    break;
                case 'L':
                    arr[1]++;
                    break;
                case 'U':
                    arr[2]++;
                    break;
                case 'D':
                    arr[3]++;
                    break;
            }
        }
        return arr[0] == arr[1] && arr[2] == arr[3];
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UU"));
    }
}
