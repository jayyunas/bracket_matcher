/*
*
*/
public class Stack{
	private char numStack[];
	private int top = -1;
	
	public Stack(int capacity){
		numStack = new char[capacity];
	}
	public int size(){
		return(top+1);
	}
	public long peek(){
		return numStack[top];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	public void push(char input){
		if (size()==numStack.length){
			throw new IllegalStateException("Stack is full");
		}
		numStack[++top] = input;
	}
		
	public char pop(){
		if (isEmpty()){
			throw new IllegalStateException("Stack is empty");
		}
		char answer = numStack[top];
		top--;
		return answer;
	}
}