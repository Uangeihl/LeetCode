import com.sun.deploy.net.MessageHeader;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * 实现 MinStack 类:
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 */
public class MinStack_155 {
    Stack<Integer> stack;
    Stack<Integer> ministack;

    public MinStack_155() {
        stack = new Stack<>();
        ministack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (ministack.isEmpty() || ministack.peek() >= val) {
            ministack.push(val);
        }
    }

    public void pop() {
        int temp = stack.pop();
        if (ministack.peek() == temp) {
            ministack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return ministack.peek();
    }
}
