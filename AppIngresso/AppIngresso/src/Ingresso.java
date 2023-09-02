public class Ingresso {

    private float valor;

     Ingresso(float val){
        this.valor = val;
    }

    public float getValor(){
        return this.valor;
    }

    public String toString(){
        return Float.toString(this.valor);
    }
    
}
