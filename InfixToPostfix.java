// Tat Putjorn 672115024 //

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InfixToPostfix {

    public static boolean isValidInfix(String expression) {
        int count = 0;
        for (char ch : expression.toCharArray()) {
            if (ch == '(') count++;
            else if (ch == ')') count--;
            if (count < 0) return false;
        }
        return count == 0;
    }

    public static String infixToPostfix(String expression) {
        Stack stack = new Stack();
        StringBuilder postfix = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java InfixToPostfix <filename>");
            return;
        }

        String filePath = args[0]; 

        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            while (fileScanner.hasNextLine()) {
                String expression = fileScanner.nextLine();
                System.out.println("Infix exp: " + expression);

                if (isValidInfix(expression)) {
                    System.out.println("Valid");
                    System.out.println("Postfix exp: " + infixToPostfix(expression));
                } else {
                    System.out.println("Not-Valid");
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
