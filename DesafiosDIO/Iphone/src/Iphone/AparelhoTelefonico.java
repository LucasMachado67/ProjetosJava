package Iphone;

import java.util.Scanner;

public class AparelhoTelefonico {
	Scanner scan = new Scanner(System.in);
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
		atender();
	}
	
	private void atender() {
		System.out.println("Digite 1 para atender a ligação ou 2 para recusar");
		int num = scan.nextInt();
		if(num == 1) {
			System.out.println("Olá");
		}else if(num == 2) {
			System.out.println("Chamada recusada ou não atendida");
			iniciarCorreioVoz();
		}else {
			System.out.println("Número digitado não reconhecido");
		}
	}
	
	private void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}
}
