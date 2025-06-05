package com.dio;

import java.util.ArrayList;
import java.util.List;

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

    public List<candidato> candidatosAprovcados(List<candidato> c) {
        List<candidato> aprov = new ArrayList<>();

        for (candidato can : c) {
            if (can.getSalario() <= 2000) {
                aprov.add(can);
            }
            if (aprov.size() > 5) {
                return aprov;
            }
        }
        return aprov;
    }
}
