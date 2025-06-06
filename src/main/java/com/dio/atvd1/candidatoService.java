package com.dio.atvd1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class candidatoService {
    public String analisarCandidato(Candidato c) {
        double salarioBase = 2000;
        if (c.getSalario() > salarioBase) {
            return "Ligar para o Candidato";
        }
        if (salarioBase == c.getSalario()) {
            return "Ligar para o Candidato com contra proposta";
        }
        return "Aguardando os outros candidatos";
    }

    public List<Candidato> candidatosAprovcados(List<Candidato> c) {
        return c.stream()
                .sorted(Comparator.comparing(Candidato::getSalario))
                .filter(Candidato -> Candidato.getSalario() <= 2000)
                .limit(5)
                .toList();
    }

    public List<Candidato> tentarLigar(List<Candidato> candi) {
        List<Candidato> cont = new ArrayList<>();
        for (Candidato c : candi) {
            for (int i = 0; i < 2; i++) {
                if (ThreadLocalRandom.current().nextInt(0, 3) == 1) {
                    cont.add(c);
                    break;
                }
            }
        }
        return cont;
    }
}
