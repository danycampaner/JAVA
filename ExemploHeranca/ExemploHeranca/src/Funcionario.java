public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(){
        this.nome = "";
        this.cpf = "";
        this.salario = 0;

    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
    
}
