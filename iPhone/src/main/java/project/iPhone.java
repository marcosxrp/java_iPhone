package main.java.project;

import main.java.project.ReprodutorMusical;
import main.java.project.AparelhoTelefonico;
import main.java.project.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para um contato...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada...");
    }

    @Override
    public void iniciarConversaVoz() {
        System.out.println("Iniciando conversa por voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Teste
        iphone.tocar();
        iphone.ligar();
        iphone.exibirPagina("https://www.example.com");
    }
}


