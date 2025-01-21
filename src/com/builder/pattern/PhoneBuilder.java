package com.builder.pattern;

public class PhoneBuilder {
	private String os;
	private int ramSize;
	private String companyProcessor;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}

	public PhoneBuilder setCompanyProcessor(String companyProcessor) {
		this.companyProcessor = companyProcessor;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(companyProcessor, ramSize, companyProcessor);
	}
}
