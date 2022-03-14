package com.bridgelabz.ds.linkedlist;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;

	public boolean add(INode<K> newNode) {
		if (tail == null) {
			tail = newNode;
		}
		if (head == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		return true;
	}

	@Override
	public String toString() {

		return head.toString();
	}
}