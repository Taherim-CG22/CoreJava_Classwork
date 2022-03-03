package com.cg;

 class Rectangle extends Shape {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.readDimension();
		r.calculateArea();
		r.calculatePiremter();
		
		
	}

	@Override
	public void calculateArea() {
		System.out.println("Area:"+(length*breadth));
		
	}

	@Override
	public void calculatePiremter() {
		System.out.println("Perimetr:"+(2*(length+breadth)));
		
	}

}
