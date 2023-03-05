package com.factory;

public class SubjectName {
	public Percentage getMark(String subj) {
		if(subj == null) {
			return null;
		}
		if(subj.equals("Computer Science")) {
			return new CS();
		}
		else if(subj.equalsIgnoreCase("math")) {
			return new Math();
		}
		else if(subj.equalsIgnoreCase("Physics")) {
			return new Physics();
		}
		else if(subj.equalsIgnoreCase("Chemistry")) {
			return new Chemistry();
		}
		else if(subj.equalsIgnoreCase("English")) {
			return new English();
		}
		else if(subj.equalsIgnoreCase("Total")){
			return new Maximum();
		}
		return null;
	}
}
