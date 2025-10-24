
package com.mycompany.mavenproject1;


public class CustomStack {
    private int[] stack;
    private int top;
    
    public CustomStack(int maxsize){
        stack = new int[maxsize];
        top=-1;
    }
    public void push(int x){
        if (top< stack.length -1){
            stack[++top]=x;
        }
    }
    public int pop(){
        if (top == -1)return -1;
        return stack[top--];
    }
    public void increment(int k, int val){
        int limit = Math.min(k, top +1);
        for(int i =0; i<limit;i++){
            stack[i] += val;
        }
    }
}
