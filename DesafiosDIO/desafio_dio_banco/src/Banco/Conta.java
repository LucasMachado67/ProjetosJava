package Banco;

import java.util.ArrayList;
import java.util.List;

public  class Conta implements InterConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo; 
	protected Cliente cliente;
	private List<Transacao> historicoTransacoes;


	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
		this.historicoTransacoes = new ArrayList<>();
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		
		if(saldo < valor) {
			System.out.println("O seu saldo é insuficiente");
			return;
		}else {			
			saldo -= valor;
		}
		adicionarTransacao("Saque", valor);
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		adicionarTransacao("Depósito", valor);

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            adicionarTransacao("Transferência para conta " + contaDestino.getNumeroConta(), valor);
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente.");
        }
	}
	
	private void adicionarTransacao(String tipoTransacao, double valor) {
        Transacao transacao = new Transacao(tipoTransacao, valor);
        historicoTransacoes.add(transacao);
    }
	
	public void imprimirInfosComums() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (Transacao transacao : historicoTransacoes) {
            transacao.imprimirExtrato();
        }
    }
}
