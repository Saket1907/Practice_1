package com.datastructure.practice.comparable.comparator;


public class Details{ //implements Comparable<Details>{
	
	private int id;
	private String brand;
	private String address;
	private String month;
	
		
	public Details(int id, String brand, String address, String month) {
		super();
		this.id = id;
		this.brand = brand;
		this.address = address;
		this.month = month;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	
	@Override
	public String toString() {
		return "Details [id=" + id + ", brand=" + brand + ", address=" + address + ", month=" + month + "]";
	}
	
	/*
	 * @Override public int compareTo(Details details) { // TODO Auto-generated
	 * method stub if(this.getBrand().startsWith("S") !=
	 * details.getBrand().startsWith("A")) { return 1; }else { return -1; }
	 * 
	 * }
	 */

}
