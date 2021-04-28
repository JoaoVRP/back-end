package views;
import java.util.Scanner;

import controllers.ContaController;

import models.Conta;
import models.Deposito;

public class TelaDeposito {

	static Deposito deposito;
	static Scanner sc = new Scanner(System.in);
	
	public static short mostrarTela(Conta conta) {
	
		deposito = new Deposito();
		
		System.out.println("\n -- CLIENTE - DEP�SITO -- \n");
		
		System.out.println("Qual o valor a ser depositado:");
		deposito.setValorDeposito(sc.nextDouble());
		
		System.out.println("Tem certeza que deseja depositar esse valor?");
		System.out.println("(1) Sim");
		System.out.println("(0) N�o");
		
		sc.nextLine();
		short opcao = sc.nextShort();
		switch (opcao) {
		case 1: {
			
			ContaController.depositar(conta, deposito.getValorDeposito());
			System.out.println("Dep�sito realizado com sucesso!");
			return 1;
		}
		case 0: {
			
			break;
		}
		default:
			System.out.println("Valor inv�lido: " + opcao);
		}
		
		
		return 0;
	}
}
