public class fUNCIONARIO extends pessoa{
    
        private double salario;

        public fUNCIONARIO(){
            this.salario = 0;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double sal) {
            if (sal < this.salario){
                System.out.println("!!!!!!!!!!!!!");
                System.out.print("SALÁRIO INFORMADO MENOR QUE O SALÁRIO ATUAL");
                System.out.println(this.salario);
                System.out.println("!!!!!!!!!!!!!");

            }
            else{
                this.salario = sal;
            }
           
        }

       public void _toString(){
        System.out.print("Nome: ");
        System.out.println(this.getNome());
        System.out.print("Endereço: ");
        System.out.println(this.getEndereco());
        System.out.print("Idade: ");
        System.out.println(this.getIdade());
        System.out.print("Salário: ");
        System.out.println(this.getSalario());
       }
    }
        
    
    
       
        
    
    
    

