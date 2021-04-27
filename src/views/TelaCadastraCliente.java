package views;
import java.util.Scanner;
import java.util.Date;

import models.Cliente;
import models.Conta;
import controllers.ListaClientes;
import controllers.ContaController;
import controllers.SenhaController;

public class TelaCadastraCliente {
		
	static Scanner sc = new Scanner(System.in);	
	static Cliente cliente;
	static Conta conta;
	
	public static short mostrarTela() {
	
		cliente = new Cliente();
		conta = new Conta();
		cliente.setData(new Date());
		
		System.out.println("\n-- CADASTRO - CLIENTE --\n");
		
		System.out.println("Digite o nome do cliente:");
		cliente.setNome(sc.nextLine());
		
		System.out.println("Digite o CPF do cliente:");
		cliente.setCpf(sc.nextLine());
		conta.criarConta(cliente.getCpf());
		
		System.out.println("Digite uma senha para a conta:");
		conta.setSenha(sc.nextLine());
		System.out.println("Digite a senha novamente:");
		  
		if (SenhaController.verificar(sc.nextLine(), conta.getSenha())) {
			
			System.out.println("Senha válida!");
		} else {
			
			System.out.println("As senhas devem ser iguais. Tente novamente!");
			return 0;
		}
		
		System.out.println("Digite o email do cliente:");
		cliente.setEmail(sc.nextLine());
		
		System.out.println("Digite o endereço do cliente:");
		cliente.setEndereco(sc.nextLine());
		
		System.out.println("Digite o telefone do cliente:");
		cliente.setTelefone(sc.nextLine());
		
		System.out.println("Digite a data de nascimento do cliente:");
		cliente.setDataNasc(sc.nextLine());
		
		if (ListaClientes.cadastrar(cliente)) {
			
			ContaController.cadastrar(conta);
			System.out.println("Cliente cadastrado com sucesso!");
		} else {
			
			System.out.println("Cliente já cadastrado!");
		}
		
		return 1;
	}
	
}
