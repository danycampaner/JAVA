public class CDs extends Produto {

    private int nrFaixas;

    public CDs(String nom, float pre, int nrf){

         super(nom, pre);
        this.nrFaixas = nrf;

    }

    public String toString(){
        String msg;
        
        msg = ">>> CATEGORIA CDs <<<";
        msg = msg + "\n" + super.toString();
        msg = msg + "\n" + "Nr de Faixas: " + this.nrFaixas;

        return msg;
    }
    
    }
    