package controllers;
import java.util.ArrayList;

import models.Cliente;

public class ListaClientes {

	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static Boolean cadastrar(Cliente cliente) {

		if (clientes.isEmpty()) {
			
			clientes.add(cliente);
			return true;
		} else if (autenticarCpf(cliente)) {
			
			clientes.add(cliente);
			return true;
		} else {
			
			return false;
		}
		
	}
	
	
//	METODO AUTENTICACAO CPF
	public static Boolean autenticarCpf(Cliente cliente) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCpf().equals(cliente.getCpf())) {
				
				return false;
			}
		}
		
		return true;
	}
	
//	
	static Cliente cliente;
	public static Cliente buscarConta(String numeroConta) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getConta().getNumeroConta().equals(numeroConta)) {
				
				return clientes.get(i);
			}
		}
		
		return cliente;
	}
	
}
