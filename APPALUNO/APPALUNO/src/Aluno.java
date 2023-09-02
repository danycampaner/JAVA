
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    

    public Aluno(){
        this.nome = "Sem Nome";
        this.nota1 = -1;
        this.nota2 = -1;
        
    }

    public Aluno (String nm, double n1, double n2){
        this.setNome (nm);
        this.setNota1(n1);
        this.setNota2 (n2);
        
    }

    public double getNota1(){
        return this.nota1;
    }

    public void setNota1 (double n1){

        if ((n1 >= 0) && (n1 <= 100)){
            this.nota1 = n1;
        }
        else{
            System.out.println("Valor invalido para Nota1");
        }
        
    }

    public double getNota2(){
        return this.nota2;
    }

    public void setNota2 (double n2){

        if ((n2 >= 0) && (n2 <= 100)){
        this.nota2 = n2;
        }

        else{
            System.out.println("Valor invalido para Nota2");
        }

    }

    public void setNome(String nm){
        this.nome = nm;
    }

    public String getNome (){
        return this.nome;
    }

    public double media(){
        return ((this.nota1 + this.nota2) /2);


    }


}

