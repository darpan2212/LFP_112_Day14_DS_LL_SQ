package com.bridgelabz.ds.linkedlist;

public class MyArrayList<K> implements UnOrderedList<K> {

	protected MyLinkedList<K> list;

	public MyArrayList() {
		list = new MyLinkedList<>();
	}

	@Override
	public void add(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		list.addFirst(itemNode);
	}

	@Override
	public void append(K item) {
		INode<K> itemNode = new MyNode<K>(item);
		list.addLast(itemNode);
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
	public void insert(int pos, K item) {
		INode<K> itemNode = new MyNode<K>(item);
		list.insert(pos, itemNode);
	}

	@Override
	public K pop() {
		INode<K> popNode = list.pop();
		return popNode.getKey();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}