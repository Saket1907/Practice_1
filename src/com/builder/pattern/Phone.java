package com.builder.pattern;

public class Phone {
	private String os;
	private int ramSize;
	private String companyProcessor;

	public Phone(String os, int ramSize, String companyProcessor) {
		super();
		this.os = os;
		this.ramSize = ramSize;
		this.companyProcessor = companyProcessor;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ramSize=" + ramSize + ", companyProcessor=" + companyProcessor + "]";
	}

}
