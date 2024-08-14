package Iphone;

public class ReprodutorMusical{
	
	public void tocar() {
		System.out.println("Tocando a música...");
	}
	
	public void pausar() {
		System.out.println("Música pausada");
	}

	public void selecionarMusica(String nomeMusica) {
		System.out.println("Selecionando Música");
		System.out.println("Música selecioanda: " + nomeMusica);
	}
}
