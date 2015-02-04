package com.ibanheiz;

public class PersonNull extends Person {
	
	@Override
	public void doCrazy() {
		super.doCrazy();
		System.out.println("E faço loucuras sendo um cara Nullo");
	}

	@Override
	public String getNome() {
		return "";
	}
	
	@Override
	public int getIdade() {
		return 0;
	}
	
	@Override
	public String getCpf() {
		return "";
	}
}
