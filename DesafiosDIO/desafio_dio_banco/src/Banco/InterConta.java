package Banco;

public interface InterConta {
	
	public void sacar(double valor);

	public void depositar(double valor);

	public void transferir(double valor, Conta contaDestino);
}
