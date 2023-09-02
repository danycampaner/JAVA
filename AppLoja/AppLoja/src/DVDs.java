public class DVDs extends Produto {

    private int duracao;

    public DVDs(String nom, float pre, int dur){

         super(nom, pre);
        this.duracao = dur;

    }

    public String toString(){
        String msg;
        
        msg = ">>> CATEGORIA DVDs <<<";
        msg = msg + "\n" + super.toString();
        msg = msg + "\n" + "Duração: " + this.duracao;

        return msg;
    }
}