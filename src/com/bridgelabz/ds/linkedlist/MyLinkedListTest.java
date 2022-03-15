package com.bridgelabz.ds.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(70);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(56);
		INode<Integer> fourthNode = new MyNode<>(75);

		intList.addFirst(firstNode);
		intList.addFirst(secondNode);
		intList.addFirst(thirdNode);
		intList.addFirst(fourthNode);

		System.out.println(intList);
	}

}