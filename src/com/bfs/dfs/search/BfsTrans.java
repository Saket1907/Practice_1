package com.bfs.dfs.search;

import java.util.Iterator;
import java.util.LinkedList;

public class BfsTrans {

	private int V; // number of vertex
	private LinkedList<Integer> adj[]; // adj list

	@SuppressWarnings("unchecked")
	BfsTrans(int v){
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList<Integer>(); 
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	void BFS(int s) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + "  ");

			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String[] args) {
		BfsTrans bfsTrans = new BfsTrans(4);

		bfsTrans.addEdge(0, 1);
		bfsTrans.addEdge(0, 2);
		bfsTrans.addEdge(1, 2);
		bfsTrans.addEdge(2, 0);
		bfsTrans.addEdge(2, 3);
		bfsTrans.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		bfsTrans.BFS(2);

	}

}
