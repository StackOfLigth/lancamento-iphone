package br.com.lancamento.iphone.model;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public String tocar() {
        return "Tocando música";
    }

    @Override
    public String pausar() {
        return "Música pausada";
    }

    @Override
    public String selecionarMusica() {
        return "Musica selecionada";
    }

    @Override
    public String ligar() {
        return "Ligando...";
    }

    @Override
    public String atender() {
        return "Atendendo ligação...";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Inicando correio de voz";
    }

    @Override
    public String exibirPagina() {
        return "Exibindo pagina";
    }

    @Override
    public String adicioarNovaAba() {
        return "Adicionando nova aba...";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando pagina";
    }
}
