package com;

public class ShapeFactory {
	public Shape getShape(String shapeType){
		Shape shape = null;
		if(shapeType.equals("circle")){
			shape = new Circle();
		}
		return shape;
	}
}
