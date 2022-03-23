package com.bridgelabz.ds.stack.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.bridgelabz.stack.MyStack;

public class StackTest {

	@Test
	public void pushStack() {
		System.out.println(
				"-------------peek---------------");
		MyStack<Integer> stack = new MyStack<>();

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println(stack);
		System.out.println(stack.peek());
		assertEquals(56, stack.peek());
	}

	@Test
	public void popStack() {
		System.out
				.println("-------------pop---------------");
		MyStack<Integer> stack = new MyStack<>();

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println(stack);
		assertEquals(56, stack.pop());
		System.out.println(stack);
	}

}