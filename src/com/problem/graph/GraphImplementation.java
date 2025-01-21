package com.problem.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph<T>{
	private Map<T, List<T>> myMap = new HashMap<>();
	
	public void addVertex(T s) {
		myMap.put(s, new LinkedList<T>());
	}
	
	public void addEdge(T source, T destination, boolean biDirectional) {
		if(!myMap.containsKey(source)) {
			addVertex(source);
		}
		if(!myMap.containsKey(destination)) {
			addVertex(destination);
		}
		
		myMap.get(source).add(destination);
		
		if(biDirectional == true) {
		myMap.get(destination).add(source);
		}
		
		
	}
}

public class GraphImplementation {
	public static void main(String[] args) {

	}

}
