package com.bridgelabz.ds.linkedlist;

import com.bridgelabz.list.INode;
import com.bridgelabz.list.OrderedList;

public class SortedLinkedList<K extends Comparable<K>>
		implements OrderedList<K> {

	MyLinkedList<K> list;
	
	public SortedLinkedList() {
		list = new MyLinkedList<>();
	}

	@Override
	public void add(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		int pos = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getKey().compareTo(item) > 0) {
				pos = i;
			} else {
				pos = i + 1;
			}
		}
		list.insert(pos, itemNode);
	}

	@Override
	public void remove(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		list.remove(itemNode);
	}

	@Override
	public boolean search(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		return list.search(itemNode);
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public int index(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		return list.index(itemNode);
	}

	@Override
	public K pop() {
		INode<K> popNode = list.pop();
		return popNode.getKey();
	}

	@Override
	public K pop(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}