package com.bridgelabz.ds.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(56);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(70);
		INode<Integer> fourthNode = new MyNode<>(75);
		INode<Integer> fifthNode = new MyNode<>(43);
		INode<Integer> sixNode = new MyNode<>(77);
		INode<Integer> sevenNode = new MyNode<>(20);
		intList.add(firstNode);
		intList.add(secondNode);
		intList.add(thirdNode);
		intList.add(fourthNode);
		intList.add(fifthNode);
		intList.add(sixNode);
		intList.add(sevenNode);

		System.out.println(intList);
	}

}