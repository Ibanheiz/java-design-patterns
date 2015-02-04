package com.ibanheiz;

public class PersonFactory {
	
	public static Person createPerson(boolean newPerson) {
		if (newPerson) {
			return new Person("Nicolas", 20, "43210308896");
		} else {
			return new PersonNull();
		}
	}

}
