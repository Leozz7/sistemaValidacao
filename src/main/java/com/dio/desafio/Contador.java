package com.dio.desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static void contar(int paraUm, int paraDois) throws ParametrosInvalidosException {
        if (paraUm >= paraDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = paraDois - paraUm;
        for (int i = 0; i < contagem; i++) {
            System.out.print((i+1) + " ");
        }
    }
}
