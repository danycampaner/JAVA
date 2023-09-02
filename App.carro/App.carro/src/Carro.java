public class Carro {
    private String placa;
    private float autonomia;
    private boolean ligado;
    private int odometro;


    public Carro() {
        this.placa = "---";
        this.autonomia = 0;
        this.ligado = false;

    }

    public Carro (String pl, float au){
        this.placa = pl;
        this.autonomia = au;
        this.ligado = false;

    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public float getAutonomia(){
        return this. autonomia;
    }

    public void setAutonomia (float autonomia){
        this.autonomia = autonomia;
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public void setLigado (boolean ligado){
        this.ligado = ligado;
    }

    public void Ligar(){
        this.ligado = true;
    }

    public int getOdometro(){
        return this.odometro;
    }

    public void setOdometro(int odometro){
        this.odometro = odometro;
    }

    public float consumoViagem(){
        float litros; 
        litros = this.odometro / this.autonomia;
        return litros;

    }

    public void exibeAtributos(){
        System.out.println("Placa: "+ this.placa);
        System.out.println("Autonomia: " + this.autonomia);
        System.out.println("Ligado: " + this.ligado);
    }
    
    public float custoViagem(float valorLitro){
       float litros, vlrTotal;
       
       litros = this.consumoViagem();
       vlrTotal = litros * valorLitro;

       return vlrTotal;
    }
    


}
