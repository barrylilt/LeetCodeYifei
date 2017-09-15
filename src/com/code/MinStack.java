package com.code;

import java.util.Stack;

public class MinStack {
 /** initialize your data structure here. */
    
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
         stack=new Stack<Integer>();
        minStack=new Stack<Integer>();
    }
    
    public void push(int x) {
      
        stack.push(x);
        
        if(minStack.isEmpty()){
            minStack.push(x);
        }
        else {
            minStack.push(Math.min(x, minStack.peek()));
        }
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
    
    public static void main(String arg[]){
    	MinStack obj=new MinStack();
    	obj.push(2);
    	obj.push(4);
    	obj.pop();
    	int num1=obj.top();
    	int num2=obj.getMin();
    	
    	System.out.println("top is "+ num1);
    	System.out.println("min is "+ num2);   	   	
    }
}
