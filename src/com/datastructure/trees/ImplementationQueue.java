package com.datastructure.trees;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementationQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i < 10; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		queue.poll(); //1 element was 1 and after poll, 1 is removed from the queue
		System.out.println(queue);

	}

}
