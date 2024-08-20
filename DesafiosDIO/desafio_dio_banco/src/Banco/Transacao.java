package Banco;

import java.time.LocalDateTime;

public class Transacao {
	
	private String tipoTransacao;
	private double valor;
	private LocalDateTime data;
	
	public Transacao(String tipoTransacao, double valor) {
		this.tipoTransacao = tipoTransacao;
		this.valor = valor;
		this.data = LocalDateTime.now();
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public double getValor() {
		return valor;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	
	public void imprimirExtrato() {
		System.out.println(this.getTipoTransacao());
		System.out.println(this.getData());
		System.out.println(this.getValor()); 
	}
	 
	
	
}
