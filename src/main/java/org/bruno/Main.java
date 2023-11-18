package org.bruno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite a altura da piramide: ");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        Espaco espaco = new Espaco();
        Sustenido sustenido = new Sustenido();

        for (int i = 1; i <= altura; i++) {
            espaco.verificaQuantidadeEspacos(altura, i);
            sustenido.verificaQuantidadeSustenidos(i);
            String linha = espaco.adicionaEspacos(altura, i) + "/" + sustenido.adicionaSustenidos(i) + "\\";
            System.out.println(linha);
        }

    }

}