package org.bruno;

public class Sustenido {

    public int verificaQuantidadeSustenidos(int linha) {
        return linha * 2 - 1;
    }

    public String adicionaSustenidos(int linha) {
        int quantidade = verificaQuantidadeSustenidos(linha);
        String cerquilha = "";
        for (int i = 0; i < quantidade; i++) {
            cerquilha = cerquilha + "#";
        }
        return cerquilha;
    }

}
