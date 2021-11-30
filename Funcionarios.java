package Checkpoint_Poo;

import java.time.LocalDate;

public abstract class Funcionarios {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;

    public Funcionarios(String nome, String cpf, LocalDate dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
}
