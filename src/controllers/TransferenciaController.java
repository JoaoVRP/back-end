package controllers;
import java.util.List;

import models.Conta;

public class TransferenciaController {

	static List<Conta> contas = ContaController.listaConta();
	
	public static void transferir(Conta conta, Conta conta2, double valorTransferencia) {
		
		conta2.setSaldo(conta2.getSaldo() + valorTransferencia);
		conta.setSaldo(conta.getSaldo() - valorTransferencia);
	}
	
}
