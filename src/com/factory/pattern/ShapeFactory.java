package com.factory.pattern;

public class ShapeFactory {
	public Shape getShape(String giveShape) {
		if (giveShape.equals("1")) {
			return new Circle();
		} else if (giveShape.equals("2")) {
			return new Square();
		} else if (giveShape.equals("3")) {
			return new Ractangle();
		}
		return null;
	}

}
