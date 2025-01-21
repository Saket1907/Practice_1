package com.ds.binarytree;

public class BinaryTree {
	Node root;
	
	int maxDepth(Node node) {
		if(node == null) {
			return 0;
		}else {
			int leftDepth = maxDepth(node.left);
			int rightDepth = maxDepth(node.right);
			
			if(leftDepth > rightDepth) {
				return leftDepth + 1;
			}else {
				return rightDepth + 1;
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		System.out.println("depth of tree :: "+bt.maxDepth(bt.root));

	}

}
