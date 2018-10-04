package com;

public class Client {
	public static void main(String[] args){
		ShapeFactory shapeFac = new ShapeFactory();
		
		Shape circle = shapeFac.getShape("circle");
		circle.draw();
	}
}
