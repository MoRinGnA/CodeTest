import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else {
                answer = false;
            }
        }
        return answer;
    }
}