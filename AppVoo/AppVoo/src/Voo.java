public class Voo {

        private int numeroVoo;
        private String data;
        private boolean[] cadeiras;
    
        public Voo(int numeroVoo, String data) {
            this.numeroVoo = numeroVoo;
            this.data = data;
            this.cadeiras = new boolean[100];
        }
    
        public int proximoLivre() {
            for (int i = 0; i < cadeiras.length; i++) {
                if (!cadeiras[i]) {
                    return i + 1;
                }
            }
            return -1; 
        }
    
        public boolean verifica(int numeroCadeira) {
            if (numeroCadeira < 1 || numeroCadeira > 100) {
                return false; 
            }
            return cadeiras[numeroCadeira - 1];
        }
    
        public boolean ocupa(int numeroCadeira) {
            if (numeroCadeira < 1 || numeroCadeira > 100) {
                return false; 
            }
    
            if (cadeiras[numeroCadeira - 1]) {
                return false; 
            }
    
            cadeiras[numeroCadeira - 1] = true;
            return true; 
        }
    
        public int vagas() {
            int vagasDisponiveis = 0;
            for (boolean cadeira : cadeiras) {
                if (!cadeira) {
                    vagasDisponiveis++;
                }
            }
            return vagasDisponiveis;
        }
    
        public int getVoo() {
            return numeroVoo;
        }
    
        public String getData() {
            return data;
        }
    
}
