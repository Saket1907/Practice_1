package com.datastructure.trees;

class Node1{
	int keyValue;
	Node1 left;
	Node1 right;
	
	public Node1(int item) {
		keyValue = item;
		left = right = null;
	}
}

public class ImplementBineryTree {
	Node1 root;
	public void traverseNode1(Node1 node) {
		if(node != null) {
			traverseNode1(node.left);
			System.out.println(" "+node.keyValue);
			traverseNode1(node.right);
		}
	}

	public static void main(String[] args) {
		ImplementBineryTree ibt = new ImplementBineryTree();
		ibt.root = new Node1(1);
		ibt.root.left = new Node1(2);
		ibt.root.right = new Node1(3);
		ibt.root.left.left = new Node1(4);
		
		System.out.println("Binery Tree : ");
		ibt.traverseNode1(ibt.root);

	}

}
