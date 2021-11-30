package Checkpoint_Poo;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionarios> listaFuncionario = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    public void contratarFunc(Funcionarios funcionario){
        listaFuncionario.add(funcionario);
    }
}
