public class PJuridica extends Contribuinte {

    protected String cnpj; 

public PJuridica(String n,double r,String c) { 
// inicialização das varáveis de instância 
    super.nome= n;
    super.rendaBrt= r;
    this.cnpj= c;

} 
public double calcImposto() { 
// Cálculo do imposto 
return 0.0;
} 
}

    

