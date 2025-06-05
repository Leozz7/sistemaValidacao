package com.dio;



public class Main {
    public static void main(String[] args) {

        candidato c1 = new candidato("Leo", 2200);
        candidato c2 = new candidato("Ld", 1900);
        candidato c3 = new candidato("Lois", 2000);

        candidatoService cs = new candidatoService();

        System.out.println(cs.analisarCandidato(c1));
        System.out.println(cs.analisarCandidato(c2));
        System.out.println(cs.analisarCandidato(c3));
    }
}