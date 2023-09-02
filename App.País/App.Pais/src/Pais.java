public class Pais {
    private String codigo_iso;
    private String nome_pais;
    private double populacao;
    private double dimensao;
    private String iso_paises[] = {"AFG", "ZAF", "ALB", "DEU", "AND", "AGO", "AIA", "ATA", "ATG", "SAU", "DZA", "ARG", "ARM", "ABW", "AUS", 
    "AUT", "AZE", "BHS", "BHR", "BGD", "BRB", "BLR", "BEL", "BLZ", "BEN", "BMU", "BOL", "BIH", "BWA", "BRA", 
    "BRN", "BGR", "BFA", "BDI", "BTN", "CPV", "CMR", "KHM", "CAN", "KAZ", "TCD", "CHL", "CHN", "CYP", "VAT", 
    "SGP", "COL", "COM", "PRK", "KOR", "CIV", "CRI", "HRV", "CUB", "CUW", "DNK", "DJI", "DMA", "EGY", "SLV", 
    "ARE", "ECU", "ERI", "SVK", "SVN", "ESP", "FSM", "USA", "EST", "SWZ", "ETH", "FJI", "PHL", "FIN", "FRA", 
    "GAB", "GMB", "GHA", "GEO", "SGS", "GIB", "GRC", "GRD", "GRL", "GLP", "GUM", "GTM", "GGY", "GUY", "GUF", 
    "GIN", "GNQ", "GNB", "HTI", "HND", "HKG", "HUN", "YEM", "BVT", "REU", "IMN", "CXR", "NFK", "ALA", "CYM", 
    "CCK", "COK", "FRO", "FLK", "MNP", "MHL", "UMI", "PCN", "SLB", "TCA", "VGB", "VIR", "IND", "IDN", "IRN", 
    "IRQ", "IRL", "ISL", "ISR", "ITA", "JAM", "JPN", "JEY", "JOR", "KIR", "XKX", "KWT", "LAO", "LSO", "LVA", 
    "LBN", "LBR", "LBY", "LIE", "LTU", "LUX", "MAC", "MDG", "MYS", "MWI", "MDV", "MLI", "MLT", "MAR", "MTQ", 
    "MUS", "MRT", "MYT", "MEX", "MMR", "MOZ", "MDA", "MNG", "MNE", "MSR", "NAM", "NRU", "NPL", "NIC", "NER", 
    "NGA", "NIU", "MKD", "NOR", "NCL", "NZL", "OMN", "HMD", "NLD", "BES", "PLW", "PSE", "PAN", "PNG", "PAK", 
    "PRY", "PER", "PYF", "POL", "PRI", "PRT", "MCO", "QAT", "KEN", "KGZ", "GBR", "CAF", "COD", "COG", "DOM", 
    "ROU", "RWA", "RUS", "ESH", "WSM", "ASM", "SHN", "LCA", "BLM", "SMR", "MAF", "SPM", "STP", "VCT", "SEN", 
    "SLE", "SRB", "SYC", "SXM", "SYR", "SOM", "LKA", "KNA", "SDN", "SSD", "SWE", "CHE", "SUR", "SJM", "THA", 
    "TWN", "TJK", "TZA", "CZE", "IOT", "ATF", "TLS", "TGO", "TKL", "TON", "TTO", "TUN", "TKM", "TUR", "TUV", 
    "UKR", "UGA", "URY", "UZB", "VUT", "VEN", "VNM", "WLF", "ZMB", "ZWE"};
    

public Pais() {
    this.codigo_iso = "";
    this.nome_pais = "";
    this.dimensao = 0;
    this.populacao = 0;


}

public Pais (String ISO, String nm, double dim){
    this.codigo_iso = ISO;
    this.nome_pais = nm;
    this.dimensao = dim;
    verificaCodigoIso(ISO);
}

public String getcodigo_iso(){
    return this.codigo_iso;

}

public void setcodigo_iso(String c_iso){
    this.codigo_iso = c_iso;
    verificaCodigoIso(c_iso);
}

public String getnome_pais(){
    return this.nome_pais;
}

public void setnome_pais(String nm){
    this.nome_pais = nm;
}

public double getpopulacao(){
    return this.populacao;
}
public void setpopulacao(double pc){
    this.populacao = pc;
}

public double getdimensao(){
    return this.dimensao;
}
public void setdimensao(double dime){
    this.dimensao = dime;
}

public boolean EhIgual(Pais objP){
    boolean resultado = false;

    if (objP.codigo_iso == this.codigo_iso){
        resultado = true;
    }
    return resultado;
}

public double densidadePopulacional(){
    return this.populacao / this.dimensao;
}

public String maiorPais(Pais obj1, Pais obj2){
    String maiorPais = "";

    if (obj1.dimensao > obj2.dimensao){
        maiorPais = obj1.nome_pais;
    }
    else{
        maiorPais = obj2.nome_pais;
    }
    return maiorPais;
}

public void exibeAtributos (){
    System.out.println("Código ISO: " + this.codigo_iso);
    System.out.println("Nome.......: " + this.nome_pais);
    System.out.println("Dimensão.: " + this.dimensao);
    System.out.println("População: " + this.populacao);
    System.out.println("-----------------------------");

}

public void exibeTabelaISO(){
    for (int i=0; i < iso_paises.length; i+=20){
        for(int j=0; j < 20; j++){
            if (i+j >= iso_paises.length){
                break;
            }
        System.out.print(iso_paises [i+j]);
        System.out.print(" ");
    }
    System.out.println("");
}
}



private void verificaCodigoIso(String codigo){
    boolean encontrou_pais = false;

    for(int o=0; o < iso_paises.length; o++){
        if(iso_paises[o].toString() == codigo){
            encontrou_pais = true;
            System.out.println("o código de País: " + codigo + "está na posição: " + o);
            break;
        
        }
    }

    if(encontrou_pais == false){
        System.out.println("Código do país inválido: " + codigo );
       
        

    }

}
}