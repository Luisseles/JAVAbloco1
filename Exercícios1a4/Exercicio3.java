package Exerc�cios1a4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* 3-Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		categoria ela se encontra:*/
int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.printf("Sua categoria � Infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.printf("Sua categoria � Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.printf("Sua categoria � Adulto.");
		}
		else {
			System.out.printf("Voc� � novo/velho demais pra entrar.");
		}
		System.out.printf("FIM DO PROGRAMA!");

	}

}
