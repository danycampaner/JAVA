public class IngressoVip extends Ingresso {

    private float valorAdicional;

 IngressoVip(float val, float valAdic){
        super(val);
        this.valorAdicional = valAdic;
    }
    
    public String toString(){
        return Float.toString(this.getValor() + this.valorAdicional);
    }
    
}
