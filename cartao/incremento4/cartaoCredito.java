package card;

public class cartaoCredito {
        public static final String numeroCartao = null;
        private String numero;
        private Cliente cliente; // Referência ao objeto Cliente
        private double limite;
        private float saldo;


        public cartaoCredito(String numero, Cliente cliente, double limite, float saldo) {
            this.numero = numero;
            this.cliente = cliente;
            this.limite = limite;
            this.saldo = saldo;
        }
    
        // Getters
        public String getNumero() {
            return numero;
        }
    
        public Cliente getCliente() {
            return cliente;
        }
        public float getSaldo(){
            return saldo;
        }
         public double getLimite(){
            return limite;
        } 
    
        // Setters
        public void setNumero(String numero) {
            this.numero = numero;
        }
    
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        } 

        public void setSaldo(float saldo){
            this.saldo = saldo;
        }

        public void setLimite(double limite){
            this.limite = limite;
         }

        
    }
    
