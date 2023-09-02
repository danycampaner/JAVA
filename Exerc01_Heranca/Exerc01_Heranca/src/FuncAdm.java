public class FuncAdm extends fUNCIONARIO{

    private String setor;
    private String funcao;
    


    public FuncAdm(){
        this.setor = "";
        this.funcao = "";
       
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void _toString(){
        super._toString();

        System.out.print("Setor: ");
        System.out.println(this.getSetor());
        System.out.print("Função: ");
        System.out.println(this.getFuncao());
    }
    
}

