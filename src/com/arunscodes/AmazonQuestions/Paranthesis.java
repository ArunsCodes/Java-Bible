package com.arunscodes.AmazonQuestions;

import java.util.Stack;

public class Paranthesis {

    public static int fillMissingBrackets(String s){
        String s1 = fixedString(s);

        String s2 = reArrangeString(s1);

        return 0;

    }

    static String reArrangeString(String s1){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0 ; i<s1.length(); i++){
            if(s1.charAt(i) != ')' && s1.charAt(i) != ']')
                stack.push(s1.charAt(i));
            else if( s1.charAt(i)==')' && !stack.isEmpty())
            {    if(stack.pop()=='(')
                    sb2.append("()");
            }
            else if( s1.charAt(i)==']' && !stack.isEmpty()){
                stack.pop();
                sb2.append("[]");
            }

        }

        return sb2.toString();
    }

    static String fixedString (String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0 ; i<s.length(); i++){
            if(s.charAt(i)=='?')
                if(stack.pop() == '(')
                s1.append(')');
                else
                    s1.append(']');

            else {
                stack.push(s.charAt(i));
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        String s = "(?][";
        fillMissingBrackets(s);
    }
}
