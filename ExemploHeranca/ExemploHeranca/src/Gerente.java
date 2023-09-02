public class Gerente extends Funcionario {

    int senha;
    int numeroFuncGerenciados;

    //construtor:
    public Gerente(){
        this.senha = 0;
        this.numeroFuncGerenciados = 10;

    }

    public double getBonificacao(){
        return this.salario * 0.15;
    }
    
}
