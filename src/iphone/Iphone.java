package iphone;

import iphone.interfaces.internet.NavegadorInternet;
import iphone.interfaces.musica.ReprodutorMusica;
import iphone.interfaces.telefone.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusica, Telefone {
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
        tocar();
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        ligar();
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
        exibirPagina();
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
        exibirPagina();
    }
}
