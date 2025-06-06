package com.dio.atvd1;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    private final Long id;
    private String nome;
    private double salario;

    public Candidato(String nome) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.nome = nome;
        this.salario = ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(id, candidato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
