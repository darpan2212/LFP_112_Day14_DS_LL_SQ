package com.bridgelabz.stack;

import com.bridgelabz.ds.linkedlist.MyLinkedList;
import com.bridgelabz.ds.linkedlist.MyNode;
import com.bridgelabz.list.INode;

public class MyStack<K> {

	MyLinkedList<K> list;

	public MyStack() {
		list = new MyLinkedList<>();
	}

	public boolean push(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		return list.addFirst(itemNode);
	}

	public K peek() {
		return list.head.getKey();
	}

	public K pop() {
		return list.pop().getKey();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return list.size(); 
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}