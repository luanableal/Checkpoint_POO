package Checkpoint_Poo;

import java.time.LocalDate;

public class Produtor extends Funcionarios{
    private double salario;

    public Produtor(String nome, String cpf, LocalDate dataNasc, double salario) {
        super(nome, cpf, dataNasc);
        this.salario = salario;
    }




}
