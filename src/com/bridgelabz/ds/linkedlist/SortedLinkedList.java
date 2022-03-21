package com.bridgelabz.ds.linkedlist;

public class SortedLinkedList<K extends Comparable<K>>
		extends MyArrayList<K> {

	public SortedLinkedList() {
		super();
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
	public void append(K item) {
		this.add(item);
	}
}