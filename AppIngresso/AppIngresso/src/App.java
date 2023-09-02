public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Ingresso bilheteria = new Ingresso(250);
        IngressoVip site = new IngressoVip(250,  15);

        System.out.println("************************************");
        System.out.println("******* EXERCÍCIO APP INGRESSO *****");
        System.out.println("************************************");
        System.out.print("");

        System.out.println("");
        System.out.println("Ingresso Bilheteria: " + bilheteria.toString());
        System.out.println("Ingresso Site: " + site.toString());

        //Crie uma classe chamada Ingresso que possua um atributo valor e um método toString que retorne à informação do valor do ingresso.

       


        
    }
}
