package com.dio.atvd1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Candidato> list = List.of(new Candidato("Leandro"),
                new Candidato("Maria"), new Candidato("Juliano"),
                new Candidato("Felipe"), new Candidato("Mauricio"),
                new Candidato("Mariana"), new Candidato("Julia"),
                new Candidato("Henrique"), new Candidato("Marcos"));


        candidatoService cs = new candidatoService();

        List<Candidato> aprovados = cs.candidatosAprovcados(list);
        aprovados.forEach(System.out::println);

        System.out.println("\nCANDIDATOS COMUNICADOS");

        cs.tentarLigar(aprovados)
                .forEach(System.out::println);
    }
}