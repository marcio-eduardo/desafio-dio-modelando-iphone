package smartphone;

import smartphone.apple.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // métodos comuns a todos smartphones
        iphone.ligar("98765-4321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.selecionarMusica("Pagodeiro");
        iphone.tocar();
        iphone.pausar();

        // métodos exclusivos do iPhone
        iphone.ligarFaceTime("João da Silva");
        iphone.atenderFaceTime();
    }
}
