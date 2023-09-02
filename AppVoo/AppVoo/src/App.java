public class App {
    public static void main(String[] args) throws Exception {
        
            Voo voo = new Voo(2530, "2023-06-14");
    
            // Ocupando cadeiras do voo
            voo.ocupa(5);
            voo.ocupa(10);
            voo.ocupa(15);
            voo.ocupa(20);
            voo.ocupa(25);

            System.out.println("*********************************");
            System.out.println("***********PROJETO APP VOO*******");
            System.out.println("*********************************");
            System.out.println("");
    
            System.out.println("Próxima cadeira livre: " + voo.proximoLivre()); 
            System.out.println("A cadeira 5 está ocupada? " + voo.verifica(5)); 
            System.out.println("A cadeira 10 está ocupada? " + voo.verifica(10)); 
            System.out.println("A cadeira 20 está ocupada? " + voo.verifica(20)); 
            System.out.println("Número de vagas disponíveis: " + voo.vagas()); 
            System.out.println("Número do voo: " + voo.getVoo()); 
            System.out.println("Data do voo: " + voo.getData()); 
        }
    }
    

