package HW6_3;
public class Stack {
	private int[] data; // �ΥH�s���� 
	private int top; // �ΥH�Хܥثe�̤W�h��ƪ����Э� 

	public Stack(int size) {// �غc�l�A���wStack���j�p 
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
