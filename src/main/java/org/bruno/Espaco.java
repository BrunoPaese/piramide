package org.bruno;

public class Espaco {

    public int verificaQuantidadeEspacos(int altura, int linha) {
        return altura - linha;
    }

    public String adicionaEspacos(int altura, int linha) {
        int quantidade = verificaQuantidadeEspacos(altura, linha);
        String espacos = "";
        for (int i = 0; i < quantidade; i++) {
            espacos = espacos + " ";
        }
        return espacos;
    }

}
