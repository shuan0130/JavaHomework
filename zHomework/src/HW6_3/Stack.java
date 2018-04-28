package HW6_3;
public class Stack {
	private int[] data; // 用以存放資料 
	private int top; // 用以標示目前最上層資料的註標值 

	public Stack(int size) {// 建構子，指定Stack的大小 
	data = new int[size]; 
	top = -1; 
	} 

	
	public void push(int i) throws StackFullException { 
		if (top == data.length - 1) 
		throw new StackFullException("Stack is full. Size = " + data.length );
		top++;
		data[top] = i;
	} 

	 
	public int pop() throws StackEmptyException { 
	
	if (top == -1) 
	throw new StackEmptyException("Stack is empty."); 
	return data[top--]; 
	
	} 


public static void main(String[] args) throws StackFullException, StackEmptyException { 
	
	Stack s = new Stack(3); 
	s.push(2);
	s.push(3);
	s.push(1);
	s.push(5);
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	}
} 
