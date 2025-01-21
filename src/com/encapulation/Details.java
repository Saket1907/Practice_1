package com.encapulation;

public class Details {

	
		private int marks;
		private String name;
		private String address;
		
		
		
		public Details(int marks, String name, String address) {
			super();
			this.marks = marks;
			this.name = name;
			this.address = address;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}


