package com.springcore.lifecycle;

public class samosa {
    private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
    
    public void init() {
    	System.out.println("inside init");
    }
    
	public void destroy() {
		System.out.println("inside destroy");
	}
	
	}

