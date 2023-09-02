public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    

    System.out.println("***************************");
    System.out.println("******Projeto País*********");
    System.out.println("***************************");

    Pais pais1 = new Pais();
    Pais pais2 = new Pais("ARG"," Argentina", 2780000);

pais1.setcodigo_iso("DEU");
pais1.setnome_pais("Alemanha");
pais1.setdimensao(357021);
pais1.setpopulacao(83200000);

pais2.setpopulacao(47327000);

System.out.println("--- pais1 ---");
pais1.exibeAtributos();
System.out.println("");

System.out.println("--- pais2 ---");
pais2.exibeAtributos();
System.out.println("");

System.out.print("Densidade pais1: ");
System.out.println(pais1.densidadePopulacional());
System.out.print("Densidade pais2: ");
System.out.println(pais2.densidadePopulacional());

System.out.println("");
System.out.print("País com maior dimensão: ");
System.out.println(pais1.maiorPais(pais1, pais2));


System.out.println("------------------------");
System.out.println("");
pais1.exibeTabelaISO();





   // System.out.println(pais1.EhIgual(pais2));

}




}
