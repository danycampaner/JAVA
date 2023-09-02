public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*******************************");
        System.out.println("******* EXEMPLO HERANÇA *******");
        System.out.println("*******************************");
        System.out.print("");

        //estanciando o objeto
        Funcionario objFunc = new Funcionario();

        objFunc.nome = "Daniely";
        objFunc.cpf = "222.333.444-55";
        objFunc.salario = 1033.33;


        //imprimir os dados:
        System.out.print("Nome: ");
        System.out.println(objFunc.nome);
        System.out.print("Cpf: ");
        System.out.println(objFunc.cpf);
        System.out.print("Salário: ");
        System.out.println(objFunc.salario);
        System.out.print("Bonificaca: ");
        System.out.println(objFunc.getBonificacao());

        //estanciando:
        Gerente objGer = new Gerente();

        objGer.nome = "Ana";
        objGer.cpf = "111.111.111-33";
        objGer.salario = 5000;

         //imprimir os dados:
         System.out.print("Nome: ");
         System.out.println(objGer.nome);
         System.out.print("Cpf: ");
         System.out.println(objGer.cpf);
         System.out.print("Salário: ");
         System.out.println(objGer.salario);
         System.out.print("Bonificaca: ");
         System.out.println(objGer.getBonificacao());

        
    }
}
