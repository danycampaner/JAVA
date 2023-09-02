public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************");
        System.out.println("******* EXERCÍCIO 01 HERANÇA *******");
        System.out.println("************************************");
        System.out.print("");

        //ESTANCIANDO O OBJETO:
        professor objProf = new professor();
        FuncAdm objFAdm = new FuncAdm();

        objProf.setNome ("Pedro");
        objProf.setIdade (49);
        objProf.setEndereco ("Rua da Paz 34");
        objProf.setSalario (5000);

        objProf.setSalario(3000);

        objFAdm.setNome ("João");
        objFAdm.setIdade (40);
        objFAdm.setEndereco ("Rua Imaculada Conceição 1155");
        objFAdm.setSalario (5000);
        objFAdm.setSetor ("Segurança");
        objFAdm.setFuncao ("Auxiliar de Segurança");

        objProf._toString();
        System.out.println("*******");
        objFAdm._toString();

        Vendedor vendedor = new Vendedor("Carlos", 2000.0f, 10.0f);

        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getSalario());
        System.out.println(vendedor.calcularSalario());
        System.out.println(vendedor);
    }


        

    }

