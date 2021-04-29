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
		
		System.out.println("Digite o email do cliente:");
		cliente.setEmail(sc.nextLine());
		
		System.out.println("Digite o endere�o do cliente:");
		cliente.setEndereco(sc.nextLine());
		
		System.out.println("Digite o telefone do cliente:");
		cliente.setTelefone(sc.nextLine());
		
		System.out.println("Digite a data de nascimento do cliente:");
		cliente.setDataNasc(sc.nextLine());
		
		Conta conta = TelaCadastraConta.renderizar();
		
		if(conta != null && ContaController.cadastrar(conta)) {
			cliente.setConta(conta);
			if (ListaClientes.cadastrar(cliente)) {
				System.out.println("Cliente cadastrado com sucesso.");
			} else {
				System.out.println("N�o foi poss�vel cadastrar esse cliente");
			}
		} else {
			System.out.println("N�o foi poss�vel cadastrar esse cliente");
		}
				
		return 1;
	}
	
}
