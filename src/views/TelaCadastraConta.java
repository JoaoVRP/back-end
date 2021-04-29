package views;
import java.util.Scanner;

import controllers.SenhaController;
import models.Conta;

public class TelaCadastraConta {
	static Conta conta = new Conta();

	static Scanner sc = new Scanner(System.in);
	
	public static Conta renderizar() {
		System.out.println("\n-- CADASTRAR CONTA --\n");
		System.out.println("Digite o número da conta:");
		conta.setNumeroConta(sc.nextLine());		
		System.out.println("Digite uma senha para a conta:");
		conta.setSenha(sc.nextLine());
		System.out.println("Digite a senha novamente:");
		  
		if (SenhaController.verificar(sc.nextLine(), conta.getSenha())) {
			System.out.println("Senha válida!");
		} else {
			System.out.println("As senhas devem ser iguais. Tente novamente!");
			return null;
		}
		
		conta.setSaldo(0);
		
		return conta;
	}
}