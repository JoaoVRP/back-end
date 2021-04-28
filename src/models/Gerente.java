package models;
import java.util.Date;

public class Gerente {
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String matricula;
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
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public void setMatricula(String matricula) {
			this.matricula = matricula;
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
				
		public String getTelefone() {
			return telefone;
		}
		
		public String getMatricula() {
			return matricula;
		}
		
		public Date getData() {
			return data;
		}


}
