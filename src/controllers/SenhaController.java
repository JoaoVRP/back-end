package controllers;

public class SenhaController {

	public static Boolean verificar(String senha2, String senha) {
		
		if (senha2.equals(senha)) {
			
			return true;
		}	
		return false;
	}
	
}
