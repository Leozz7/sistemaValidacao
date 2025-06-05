package com.dio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

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

        for (candidato can : c.stream().sorted(Comparator.comparing(candidato::getSalario)).toList()) {
            if (can.getSalario() <= 2000) {
                aprov.add(can);
            }
            if (aprov.size() >= 5) {
                return aprov;
            }
        }
        return aprov;
    }

    public List<candidato> tentarLigar(List<candidato> candi) {
        List<candidato> cont = new ArrayList<>();
        for (candidato c : candi) {
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
