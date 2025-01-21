package com.factory.pattern;

public class FactoryCalling {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.getShape("1");
		shape.draw();
		Shape shape1 = sf.getShape("2");
		shape1.draw();
		Shape shape2 = sf.getShape("3");
		shape2.draw();

	}

}
