package DesafioDIO;

import java.util.Scanner;


public class Contador {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int num1 = scan.nextInt();
		System.out.println("Digite um número maior que o primeiro");
		int num2 = scan.nextInt();
		
		try {
			contar(num1,num2);
		}
		catch (ParametrosInvalidosException e){
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		finally {
            scan.close();
        }
	}
	
	static void contar (int par1, int par2) throws ParametrosInvalidosException{
		
		if(par1 > par2) {
			throw new ParametrosInvalidosException();
		}else {
			int contagem = par2 - par1;
			
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo número " + i);
			}
		}
		
		
	}
	
}
