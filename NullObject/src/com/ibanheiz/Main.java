package com.ibanheiz;

public class Main {
	public static void main(String[] args) {
		// true para Person existente e false para nova Person  
		Person person = PersonFactory.createPerson(true);
		
		// Aqui não será necessário uma condicional para 
		// verificar se Person está nula.
		System.out.println("Nome: " + person.getNome());
		System.out.println("Idade: " + person.getIdade());
		System.out.println("CPF: " + person.getCpf());
		System.out.println("------");
		person.doCrazy();
	}
}
