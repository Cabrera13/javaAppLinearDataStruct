/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectpractica2lds;

/**
 *
 * @author Josep
 */
public class Stack<elem> {
    private int N=20;
    private elem[] A;
    private int top;
    
    public Stack(){
        A=(elem[])new Object[N];
        top=0;
    }
    
    public void push(elem e) throws Exception{
        if(top==N)
            throw new Exception("Error: stack full");
        else{
            A[top++]=e;
        }
    }
    
    public void pop() throws Exception{
        if(top==0)
            throw new Exception("Error: stack empty");
        else
            A[--top]=null;
    }
    
    public elem peek() throws Exception{
        if(top==0)
            throw new Exception("Error: stack empty");
        else
            return A[top-1];
    }

    public boolean empty(){
        return top==0;        
    }
}
