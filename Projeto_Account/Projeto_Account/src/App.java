import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Integer numeroConta;
        String nomeTitular;
        Double balance = 0.0;
        String deposito;

        System.out.println("*************************************************************");
        System.out.println("**************         PROJETO ACCOUNT          *************");
        System.out.println("**************        Cadastro de Conta        **************");
        System.out.println("*************************************************************");
        System.out.println("");

        System.out.print("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do titular da conta: ");
        nomeTitular = sc.nextLine();
        
        System.out.print("Deseja fazer um depósito inicial (sim/não)? ");
        deposito = sc.nextLine();

        if (deposito.equals("sim")){
            System.out.print("Digite o valor do depósito inicial: ");
            balance = sc.nextDouble();
        }else{
            balance = 0.0;
        }
       
        Conta objAccount = new Conta(nomeTitular, numeroConta, balance); 
        System.out.println("*************************************************************");
        System.out.println(objAccount.toString());
        System.out.println("*************************************************************");
        System.out.print("Digite o valor a ser depositado: ");
        objAccount.depositar(sc.nextDouble());
        System.out.println("*************************************************************");
        System.out.println(objAccount.toString());
        System.out.println("*************************************************************");
        System.out.println("Digite o valor a ser retirado: ");
        objAccount.sacar(sc.nextDouble());
        System.out.println("*************************************************************");
        System.out.println(objAccount.toString());

        sc.close();
    }
}    
