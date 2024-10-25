package incremento1;

public class cartaoCredito {
    String numeroCartao = null;

    String nomeTitular;
    String cpfTitular;
    private double limite;
    private double saldo; 
   
   public cartaoCredito(String numeroCartao, String nomeTitular, String cpfTitular, double limite) {
     this.numeroCartao = numeroCartao;
     this.nomeTitular = nomeTitular;
     this.cpfTitular = cpfTitular;
     this.saldo = 0;
     this.limite = limite; 
   
     
   }
     public void realizarTransação( double valor ){
       if (valor <= limite - saldo){
           saldo += valor;
           System.out.println("Compra realizada com sucesso!!!");
       } else { 
           System.out.println("Saldo insuficiente");
       }
   }
   public double getSaldo(){
       return saldo;
   } public double getLimite(){
       return limite;
   } 
}
