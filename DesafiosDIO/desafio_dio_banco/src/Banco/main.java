package Banco;

import java.text.BreakIterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("maria");

		ContaCorrente cc = new ContaCorrente(maria);
		ContaPoupanca cp = new ContaPoupanca(maria);

		cc.depositar(100.00);
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.imprimirHistorico();
		cp.imprimirHistorico();

	}

}
