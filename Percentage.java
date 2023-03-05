package com.factory;

public abstract class Percentage {
	protected double marks;
	public abstract void marks();
	
	public double percentage(double score) {
		double m = (score/marks)*100;
		System.out.println(m+" %");
		
		return m;
	}
	
}
