classDiagram
    Iphone --> ReprodutorMusical
    Iphone --> NavegadorInternet
    Iphone --> AparelhoTelefonico


    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String nomeMusica)
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }

# Project Title

A brief description of what this project does and who it's for