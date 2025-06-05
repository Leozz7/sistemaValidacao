package com.dio;

public class candidatoService {
    public String analisarCandidato(candidato c) {
        double salarioBase = 2000;
        if (c.getSalario() > salarioBase) {
            return "Ligar para o candidato";
        }
        if (salarioBase == c.getSalario()) {
            return "Ligar para o candidato com contra proposta";
        }
        return "Aguardando os outros candidatos";
    }
}
