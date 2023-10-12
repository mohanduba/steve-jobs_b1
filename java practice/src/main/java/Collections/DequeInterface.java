package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class DequeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queue(first-in-first-out/FIFO) 
		//stack(last-in-first-out/LIFO)
		
		//Deque method
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(5);
		deque.add(3);
		deque.push(6);
		deque.offer(4);
		deque.offerFirst(7);
		deque.addFirst(1);
		deque.addLast(2);
		System.out.println(deque);
		 System.out.println(deque.pop());
		System.out.println(deque.poll());
		System.out.println(deque.peek());
	 
	        System.out.println(deque.pollFirst());
	 
	        System.out.println(deque.pollLast());
	        
//		int first = deque.removeFirst();
//		int last = deque.removeLast();
//		System.out.println("First:"+first+" Last:"+last);
	        
	    Deque<String> dq= new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");
        
        
        for(Iterator itr = dq.iterator();itr.hasNext();) {
        	System.out.print(itr.next()+" ");
        	
        }System.out.println(" ");
        
        //Stack method
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(6);
        stack.push(1);
        stack.push(5);
        System.out.println("Stack::");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("popped Elements::");
        
        while(!stack.isEmpty()) {
        	System.out.println(stack.pop());
        }
	}

}
