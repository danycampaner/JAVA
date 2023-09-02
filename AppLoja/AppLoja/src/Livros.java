public class Livros extends Produto {
    private String autor;

    public Livros(String nom, float pre, String aut){

        //construtor da minha classe produto:
        super(nom, pre);
        this.autor = aut;

    }

    public String toString(){
        String msg;
        
        msg = ">>> CATEGORIA LIVRO <<<";
        msg = msg + "\n" + super.toString();
        msg = msg + "\n" + "Autor: " + this.autor;

        return msg;
    }
    
    }
    

