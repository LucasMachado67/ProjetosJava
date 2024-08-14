package Iphone;

public class NavegadorInternet {
	
	public void adicionarNovaAba() {
		String url = "www.google.com.br";
		System.out.println("Nova página adicionada");
		exibirPagina(url);
	}
	
	private void exibirPagina(String Url) {
		System.out.println("Entrando na página " + Url);
	}
	
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}
}
