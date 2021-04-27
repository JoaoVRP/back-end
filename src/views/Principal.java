package views;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println(" -------------------- ");
			System.out.println(" - SISTEMA BANCÁRIO - ");
			System.out.println(" -------------------- ");
			
			System.out.println("\n -- MENU - PRINCIPAL -- \n");
			System.out.println("(1) Cadastrar Cliente\r\n"
								+ "(2) Entrar na Conta\r\n"
//								+ "3 – Sacar\r\n"
//								+ "4 – Depositar\r\n"
//								+ "5 – Extrato\r\n"
//								+ "6 – Consultar saldo\r\n"
//								+ "7 – Transferir\r\n"
//								+ "8 – Atualizar dados cadastrais\r\n"
								+ "(0) Sair\r\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				
				TelaCadastraCliente.mostrarTela();
				break;
			case 2:
				
				TelaLogin.mostrarTela();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				break;
			case 6:
				
				break;
			case 7:
				break;
			case 8:
				
				break;
			case 0:
				System.out.println("\nEncerrando sistema.");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}			
		} while (opcao != 0);
		
		sc.close();
		
	}

}
