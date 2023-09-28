package com.tekarch.assignments;

public class StackDemo {
	private int size;
	private int[] a;
	private int top;
	
	public StackDemo(int s) {
		size=s;
		a=new int[s];
		top=-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public int peek() {
		return a[top];
	}
	public void push(int item) {
		if(isFull())
			System.out.println("Cant insert the values");
		else {
			top++;
			a[top]=item;
			
		}
		System.out.println("Item has been inserted");
	}
	public int pop() {
		int deleted=-1;
		if(isEmpty())
			System.out.println("No more elements left in the stack");
		else {
			deleted=a[top];
			top--;
			
		}
		return deleted;
	}
	public void display() {
		System.out.println("Content of stack:");
		int temp=top;
		while(temp>-1) {
			System.out.println(a[temp]);
			temp--;
		}
	}
	
	

	public static void main(String[] args) {
		StackDemo s= new StackDemo(5);
		s.push(1);
		s.push(3);
		s.push(5);
		s.display();
		
		int x=s.pop();
		System.out.println("Deleted element is"+ x);
		System.out.println("after popping");
		s.display();
		

	}

}
