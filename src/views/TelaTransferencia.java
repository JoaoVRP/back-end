package views;
import java.util.Scanner;

import controllers.ContaController;
import models.Conta;
import models.Transferencia;
import controllers.TransferenciaController;

public class TelaTransferencia {

	static Scanner sc = new Scanner(System.in);
	static Transferencia transferencia;
	static Conta conta2;
	
	public static short mostrarTela(Conta conta) {
		
		transferencia = new Transferencia();
		conta2 = new Conta();
//		GUARDAR OBJETO TRANSFERENCIA DENTRO DO MODEL CONTA 
		
		System.out.println("\n -- CLIENTE - TRANSFER�NCIA -- \n");
		
		System.out.println("Digite o valor da transfer�ncia:");
		transferencia.setValor(sc.nextDouble());
		
		sc.nextLine();
		if (ContaController.checarSaldo(conta, transferencia.getValor())) { 
//		CHECAR SE SALDO � SUFICIENTE
			
			System.out.println("Para qual conta deseja transferir (CPF do dono da conta):");
			conta2.setNumeroConta(sc.nextLine());
			
			if (ContaController.checarConta(conta2.getNumeroConta())) {
//			CHECA SE A CONTA PARA QUAL VAI SER TRANSFERIDA EXISTE

				
				System.out.println("Deseja mesmo realizar a tranfer�ncia?");
				System.out.println("(1) Sim, desejo realizar a tranfer�ncia.");
				System.out.println("(0) N�o. Voltar para o 'Menu Cliente'.");
				
				short opcao = sc.nextShort();
				switch (opcao) {
				case 1: {
					
					conta2 = ContaController.buscarConta(conta2.getNumeroConta());

					TransferenciaController.transferir(conta, conta2, transferencia.getValor());
					System.out.println("Transfer�ncia realizada com sucesso!");
					break;
				}
				case 0: {
					
					System.out.println("Voltando para 'Menu Cliente'...");
					return 1;
				}
				default:
					System.out.println("Valor inv�lido: " + opcao);
				}
				
			} else {
				
				System.out.println("A conta digitada n�o existe.");
			}
			
		} else {
			
			System.out.println("Saldo em conta insuficiente.");
		}
		
		return 0;
	}
}
