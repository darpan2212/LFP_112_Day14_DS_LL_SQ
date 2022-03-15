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
	
	public boolean addFirst(INode<K> newNode) {
		if (tail == null) {
			tail = newNode;
		}
		if (head == null) {
			head = newNode;
		} else {
			INode<K> temp = head;
			head = newNode;
			head.setNext(temp);
		}
		return true;
	}

	@Override
	public String toString() {

		return head.toString();
	}
}