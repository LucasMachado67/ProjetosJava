package Iphone;

public class Iphone {

	public static void main(String[] args) {
		
		NavegadorInternet  navInt = new NavegadorInternet();
		navInt.adicionarNovaAba();
		navInt.atualizarPagina();
		
		ReprodutorMusical repMus = new ReprodutorMusical();
		String musica = "Playlist Sertanejo";
		repMus.selecionarMusica(musica);
		repMus.tocar();
		repMus.pausar();
		
		AparelhoTelefonico appTel = new AparelhoTelefonico();
		String numero = "99 99999-9999";
		appTel.ligar(numero);
		
		
	}

}
