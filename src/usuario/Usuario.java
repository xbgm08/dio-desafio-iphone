package usuario;

import iphone.Iphone;

public class Usuario {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.err.println("Ipod");
        iphone.selecionarMusica();
        iphone.pausar();
        System.err.println("");
        
        System.err.println("Telefone");
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.atender();
        System.err.println("");

        System.err.println("Navegador");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
