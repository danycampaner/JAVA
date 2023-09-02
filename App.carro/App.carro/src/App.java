public class App {
    public static void main(String[] args) throws Exception{

        System.out.println("***************************");
        System.out.println("******Projeto Carro********");
        System.out.println("***************************");

        Carro carroA = new Carro();
        Carro carroB = new Carro("BRA2E19", 12);

        carroB.Ligar();

        carroA.exibeAtributos();
        System.out.println("");
        carroB.exibeAtributos();
        carroB.setOdometro(300);

        System.out.println("");
        System.out.println("Distância: " + carroB.getOdometro() + "km");
        System.out.println("Litros Consumidos: " + carroB.consumoViagem());
        System.out.println("Custo da Viagem: " + carroB.custoViagem((float)5.25));
    }
        

    }


