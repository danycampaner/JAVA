public class PFisica extends Contribuinte {

    protected String cpf; 

    public PFisica(String n,double r,String c) { 
        super.nome = n;
        super.rendaBrt= r;
        this.cpf = c;


}    

    public double calcImposto() { 
       //calculo do imposto:
       return 0.0;

    }
}

