package com.cg.exceptionhandling;

@SuppressWarnings("serial")
public class ProductNotFound extends Exception {
	String exMessage;

	public ProductNotFound (String exMessage) {
		super(exMessage);
		this.exMessage = exMessage;
	}

}


