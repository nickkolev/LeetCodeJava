package TopInterviewQuestions;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;

public class p20ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> parenthesesStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            switch (ch) {
                case '(':
                case '[':
                case '{':
                    parenthesesStack.push(ch);
                    break;
                case ')':
                    if(parenthesesStack.isEmpty() || parenthesesStack.pop() != '(') {
                        return;
                    }
                    break;
                case ']':
                    if(parenthesesStack.isEmpty() || parenthesesStack.pop() != '[') {
                        return;
                    }
                    break;
                case '}':
                    if(parenthesesStack.isEmpty() || parenthesesStack.pop() != '{') {
                        return;
                    }
                    break;
            }

        }
    }
}
