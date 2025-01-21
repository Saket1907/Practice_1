package com.datastructure.practice.newjob;

public class DoublyLinkedList {
	
	class Node{
		String data;
		Node prev;
		Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void addNewNode(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			
			head.prev = null;
			tail.next = null;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void showData() {
		Node current = head;
		 if(head == null) {
			 System.out.println("List empty");
			 return;
		 }
		 System.out.println("Nodes of double linked list :: ");
		 while(current != null) {
			 System.out.println(current.data);
			 current = current.next;
		 }
	}
	
	public static void main(String args[]) {
		System.out.println("<===OUTPUT===>");
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.addNewNode("patna");
		obj.addNewNode("dhanbad");
		obj.addNewNode("ranchi");
		obj.addNewNode("bokaro");
		obj.addNewNode("giridih");
		obj.addNewNode("pakur");
		obj.addNewNode("durgapur");
		
		obj.showData();
	}

}
