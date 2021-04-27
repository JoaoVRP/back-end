package models;
import java.util.Date;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private String telefone;
	private String dataNasc;
	private Date data;
	
//	GETTERS AND SETTERS
	
//		SETTERS
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}
		
		public void setData(Date data) {
			this.data = data;
		}
		
		
//		GETTERS
		public String getNome() {
			return nome;
		}
		
		public String getCpf() {
			return cpf;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getEndereco() {
			return endereco;
		}
		
		public String getTelefone() {
			return telefone;
		}
		
		public String getDataNasc() {
			return dataNasc;
		}
		
		public Date getData() {
			return data;
		}
}
