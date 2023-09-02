public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("******************");
        System.out.println("**** APP LOJA*****");
        System.out.println("******************");

        Produto[] prd = {
            new Livros("O Medo", 30, "Celeste"),
            new CDs("iron maiden", 113.49f,13),
            new CDs("iron maiden", 113.49f,13),
            new CDs("iron maiden", 113.49f,13),
            new DVDs("O Buraco", 50, 60),
        };



System.out.println("");

for (int i=0; i<5; i++){
    System.out.println(prd[i]);
}

    }
}
