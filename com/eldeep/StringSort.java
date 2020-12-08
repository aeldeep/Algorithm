package com.eldeep;

import java.util.Stack;

public class StringSort {

	static boolean isBalanced(String parentheses) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < parentheses.length(); i++) {
			char ch = parentheses.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (stack.empty()) {
				return false;
			} else {
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
						|| (top == '{' && ch != '}')) {
					return false;
				}
			}
		}
		return stack.empty();
	}


}
