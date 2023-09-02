public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        

        System.out.println("***********************************");
        System.out.println("********  IMPOSTO DE RENDA  ********");
        System.out.println("***********************************");

        Contribuinte []lst; 

        // obtenha a lista de contribuintes 
        lst= Contribuinte.listaContr(); 
            System.out.printf("NOME IMPOSTO\n"); 
            System.out.printf("*******\n\n"); 
        // coloque aqui o comando for { 
            for(int i= 0; i<6; i++){
        	// o printf a seguir deve exibir o nome e o 
        	// imposto que o contribuinte irá pagar 
        	System.out.printf("%-20s %9.2f\n", lst[i].getNome(), lst[i].calcImposto()); 

            }

    }
}
