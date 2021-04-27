package models;

public class Conta {

	private String numeroConta;
	private String senha;
	private Double saldo;
	
//	METODO CRIA CONTA
	public void criarConta(String cpf) {
		this.numeroConta = cpf;
		this.saldo = 0.0;
	}
	
	
//	GETTERS AND SETTERS
	
//		SETTERS
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		public void setNumeroConta(String numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	
	
//		GETTERS	
		public String getNumeroConta() {
			return numeroConta;
		}
		
		public String getSenha() {
			return senha;
		}
		
		public Double getSaldo() {
			return saldo;
		}
}
