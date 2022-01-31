package com.greatlearning.main;

import java.util.Scanner;
import java.util.Stack;
class StackBalanceStringOperations{
	public static boolean checkBracketBalanced(String data) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<data.length();i++) {
			char ch=data.charAt(i);
			if(ch=='('||ch=='['||ch=='{') {
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char c;
			switch(ch) {
			case ')':c=stack.pop();
				if(c=='{'||c=='[') {
					return false;
				}
				break;
			case '}':c=stack.pop();
				if(c=='['||c=='(') {
					return false;
				}
				break;
			case ']':c=stack.pop();
			if(c=='('||c=='{') {
				return false;
			}
				break;
				
				
				
			}
		}
		return stack.isEmpty();
	}
}
public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String ");
		String data=scan.next();
		boolean result=StackBalanceStringOperations.checkBracketBalanced(data);
		if(result) {
			System.out.println("String has balanced brackets");
		}
		else
		{
			System.out.println("String has no balanced brackets");
		}
		
	}

}
