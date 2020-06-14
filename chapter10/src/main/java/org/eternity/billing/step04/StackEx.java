package org.eternity.billing.step04;

import java.util.Stack;

/**
 * Project : oop-book
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:00 오후
 */
public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1st");
        stack.push("2st");
        stack.push("3st");

        stack.add(0,"4th");

        System.out.println("4th" == stack.pop());
    }
}
