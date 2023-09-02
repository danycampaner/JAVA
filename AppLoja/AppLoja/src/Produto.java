public class Produto {

    private String nome;
    private float preco;
    
    public Produto(String nom, float pre){
        this.nome = nom;
        this.preco = pre;
    }

    public String toString(){
        String texto;

        texto = "Nome: " + this.nome;
        texto = texto + "\n" + "Preco: " + this.preco;

        return texto;
    }


    
}
