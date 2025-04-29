package br.com.lancamento.iphone.app;

import br.com.lancamento.iphone.model.Iphone;

public class App {

    public static void main(String[] args){

        var iphone = new Iphone();

        System.out.println("=====================");
        System.out.println("Menu do navegador de internet");
        System.out.println("=====================");
        System.out.println(iphone.exibirPagina());
        System.out.println(iphone.adicioarNovaAba());
        System.out.println(iphone.atualizarPagina());

        System.out.println("=====================");
        System.out.println("Menu Aparelho telefonico");
        System.out.println("=====================");
        System.out.println(iphone.ligar());
        System.out.println(iphone.atender());
        System.out.println(iphone.iniciarCorreioVoz());

        System.out.println("=====================");
        System.out.println("Menu Reprodutor musical");
        System.out.println("=====================");
        System.out.println(iphone.selecionarMusica());
        System.out.println(iphone.tocar());
        System.out.println(iphone.pausar());

    }

}
