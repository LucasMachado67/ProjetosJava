package ContaBanco;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
	
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Digite o número da conta: ");
			int Numero = scanner.nextInt();
		
			System.out.println("Digite a sua agência: ");
			String Agencia = scanner.next();
		
			System.out.println("Digite o seu nome: ");
			String primeiroNome = scanner.next();
		
			System.out.println("Digite o seu saldo: ");
			double Saldo = scanner.nextDouble();
		
			System.out.println("Olá " + primeiroNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
		
		} catch (InputMismatchException e) {
			System.out.println("Erro: Entrada inválida. Por favor, insira os dados corretamente.");
		} finally {
			scanner.close();
		}
		
		//ESTAVA TENDO PROBLEMAS NA HORA DE INSERIR OS DADOS, QUE ESTAVA PULANDO OS INPUT'S, ENTÃO, PRECISEI ADICIONAR TRY CATCH;
	}

}
