public class Conta {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;
    

    public Conta(String nometitular, int numeroconta, double saldoInicial) {
        this.nomeTitular = nometitular;
        this.numeroConta = numeroconta;
        depositar(saldoInicial);
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String ntitular) {
        this.nomeTitular = ntitular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int nc) {
        this.numeroConta = nc;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double sd) {
        this.saldo = sd;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= (valor + 5.0);
    }

    public String toString() {
        return "Dados da conta: "
                + "\nTitular da conta: "
                + this.nomeTitular
                + "\nNúmero da conta: "
                + this.numeroConta
                + "\nSaldo: R$ "
                + this.saldo;
            
    }
}






