package com.dio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<candidato> list = List.of(new candidato("Leandro"),
                new candidato("Maria"), new candidato("Juliano"),
                new candidato("Felipe"), new candidato("Mauricio"),
                new candidato("Mariana"), new candidato("Julia"),
                new candidato("Henrique"), new candidato("Marcos"));


        candidatoService cs = new candidatoService();

        cs.candidatosAprovcados(list).stream()
                .forEach(System.out::println);
    }
}