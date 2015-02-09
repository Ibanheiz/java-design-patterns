package com.ibanheiz;

public class Main {
	public static void main(String[] args) {
		Veiculo veiculo = new Carro();
		veiculo.setMotor(new MotorPequeno());
		veiculo.dirigir();
		
		System.out.println("===============");
		
		veiculo = new Caminhao();
		veiculo.setMotor(new MotorGrande());
		veiculo.dirigir();
	}
}
