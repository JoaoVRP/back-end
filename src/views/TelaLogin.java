package views;
import java.util.Scanner;

import models.Conta;
import controllers.ContaController;

public class TelaLogin {
	
	static Conta contaLogin;
	static Conta conta;
	static Scanner sc = new Scanner(System.in);
	
	public static short mostrarTela() {
		
		contaLogin = new Conta();
		short opcao;
		
		do {
			
			System.out.println("\n -- LOG IN -- \n");
			
			System.out.println("Deseja:");
			System.out.println("(1) Entrar na Conta");
			System.out.println("(0) Voltar para Menu Principal");
			
			opcao = sc.nextShort();
			switch (opcao) {
			case 1: {
//			OPCAO 1 FAZ AUTENTICACAO DA CONTA
				sc.nextLine();
				
				System.out.println("Digite seu CPF:");
				contaLogin.setNumeroConta(sc.nextLine());
				
				System.out.println("Digite sua senha:");
				contaLogin.setSenha(sc.nextLine());
				
				
				if (ContaController.autenticarConta(contaLogin)) {
//				CHECA SE ALGUMA CONTA DA LISTA É IGUAL CONTA DO LOGIN
					
					conta = ContaController.buscarConta(contaLogin.getNumeroConta());
					TelaCliente.mostrarTela(conta);
					return 1;
				} else {
					
					System.out.println("Essa conta não existe. Por favor, tente novamente!");
				}
				break;
			}
			case 0: {
				
				return 1;
			}
			
			default:
				System.out.println("Valor inválido: " + opcao);
			}
			
		} while (opcao != 0);
			
		return 0;
	}
	
}
