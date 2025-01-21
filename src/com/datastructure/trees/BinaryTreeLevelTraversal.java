package com.datastructure.trees;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	int data;
	Node2 left;
	Node2 right;

	public Node2(int item) {
		data = item;
		left = null;
		right = null;
	}
}

public class BinaryTreeLevelTraversal {
	Node2 root;

	void printLevelOrder() {
		Queue<Node2> queue = new LinkedList<Node2>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node2 tempNode2 = queue.poll();
			System.out.print(tempNode2.data + " ");
			if (tempNode2.left != null) {
				queue.add(tempNode2.left);
			}
			if (tempNode2.right != null) {
				queue.add(tempNode2.right);
			}
		}
	}

	public static void main(String[] args) {
		BinaryTreeLevelTraversal btlt = new BinaryTreeLevelTraversal();
		btlt.root = new Node2(1);
		btlt.root.left = new Node2(2);
		btlt.root.right = new Node2(3);
		btlt.root.left.left = new Node2(4);
		btlt.root.left.right = new Node2(5);

		btlt.printLevelOrder();

	}

}
