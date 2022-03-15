package com.bridgelabz.ds.linkedlist;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;

	public boolean addLast(INode<K> newNode) {
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

	public boolean insert(int pos, INode<K> newNode) {
		if (pos == 0) {
			addFirst(newNode);
		}
		if (pos == size()) {
			addLast(newNode);
		}
		if (pos > size()) {
			return false;
		} else {
			INode<K> temp = head;
			for (int i=1;i<pos;i++) {
				temp = temp.getNext();
			}
			INode<K> temp1 = temp.getNext();
			temp.setNext(newNode);
			newNode.setNext(temp1);
		}
		return true;
	}

	public int size() {
		INode<K> temp = head;
		int size = 1;
		while (temp.getNext() != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}

	@Override
	public String toString() {

		return head.toString();
	}
}