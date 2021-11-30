package Checkpoint_Poo;

import java.time.LocalDate;

public class Musico extends Funcionarios {
    private Instrumento instrumento;
    private boolean album;
    private double cache;


    public Musico(String nome, String cpf, LocalDate dataNasc, Instrumento instrumento, boolean album, double cache) {
        super(nome, cpf, dataNasc);
        this.instrumento = instrumento;
        this.album = album;
        this.cache = cache;
    }




}
