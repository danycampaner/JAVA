public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno obj_discente = new Aluno();
        Aluno obj_discente2 = new Aluno("Giuliano gevard", 89, 91);
        
        System.out.println("---------------");
        System.out.println("     Aluno 1    ");
        System.out.println("-----------------");
        obj_discente.setNome("Daniely");
        obj_discente.setNota1(100);
        obj_discente.setNota2(100); 

     
        
        System.out.print("Nome: ");
        System.out.println(obj_discente.getNome());
        System.out.print("Nota1: ");
        System.out.println(obj_discente.getNota1());
        System.out.print("Nota2: ");
        System.out.println(obj_discente.getNota2());
        System.out.print("Media: ");
        System.out.println(obj_discente.media() );
        System.out.println("");

        System.out.println("*****************");
        System.out.println("     Aluno 2    ");
        System.out.println("*****************");

        System.out.print("Nome: ");
        System.out.println(obj_discente2.getNome());
        System.out.print("Nota1: ");
        System.out.println(obj_discente2.getNota1());
        System.out.print("Nota2: ");
        System.out.println(obj_discente2.getNota2());
        System.out.print("Media: ");
        System.out.println(obj_discente2.media() );


    }



 
}
