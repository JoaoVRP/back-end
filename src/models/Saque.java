package models;

public class Saque {

	private double valor;
	private String tipo;

//	GETTERS AND SETTERS
	
//		SETTERS
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		
//		GETTERS
		public double getValor() {
			return valor;
		}
		
		public String getTipo() {
			return tipo;
		}
		
}
