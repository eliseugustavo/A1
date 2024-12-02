import java.util.ArrayList;
import java.util.Date;

public class CartaoDeCredito {
private String numero;
        private Cliente cliente;
        private float limite;
        private float saldo;
        private float cashBack;
        private ArrayList<Transacao> historicoDeTransacoes;
    
        public CartaoDeCredito(String numero, Cliente cliente, float limite, float saldo, float cashBack){
            this.numero = numero;
            this.cliente = cliente;
            this.limite = limite;
            this.saldo = saldo;
            this.cashBack = cashBack;
            this.historicoDeTransacoes = new ArrayList<>();
        }
        
        public String getNumero(){
            return numero;
        }
        public Cliente getCliente(){
            return cliente;
        }
    
        public float getLimite(){
            return limite;
        }
    
        public float getSaldo(){
            return saldo;
        }
        public float getCashBack(){
            return cashBack;
        }
    
        public void setNumero(String numero){
            this.numero = numero;
        }
    
        public void setCliente(Cliente cliente){
            this.cliente = cliente;
        }
    
        public void setLimite(float limite){
            this.limite = limite;
        }
    
        public void setSaldo(float saldo){
            this.saldo = saldo;
        }
        public void setCashBack(float cashBack){
            this.cashBack = cashBack;
        }
    
        public float consultarLimite(){
            return limite;
    
        }
    
        public float consultarTotalSaldo() {
            return saldo;
    
        }
    
        public void realizarTransacao(float valor) {
            if (valor <= limite) {
                limite -= valor;
                historicoDeTransacoes.add(new Transacao(new Date(), valor, "compra normal"));
                float limiteAnterior = this.getLimite();
                this.setLimite(limiteAnterior - valor);
                System.out.println("Compra realizada com Sucesso!!! Valor: R$" + valor);
            } else {
                System.out.println("Saldo insuficiente. Limite disponível: R$" + limite);
            }
        }
        public void realizarTransacao(float valor, float taxaCashBack) {
            if (valor <= getLimite()) {
                float limiteAnterior = this.getLimite();
                this.setLimite(limiteAnterior - valor);
    
                float cashBack =  valor * (taxaCashBack / 100);
                this.setLimite(this.getLimite() + cashBack);
    
                float total = this.getSaldo();
                this.setSaldo(total + valor);
    
                historicoDeTransacoes.add(new Transacao(new Date(), valor, "compra com cashback de " + taxaCashBack + "%"));
    
                System.out.println("Compra realizada com Sucesso!!! Valor: R$" + valor);
                System.out.println("Cashback de R$" + cashBack);
                System.out.println();
    
            } else {
                System.out.println("Você não possui limite suficiente... Seu limite é de: R$" + getLimite());
            }
        }
    
        public void alterarLimite(float novoLimite){
            if(novoLimite >= 0){
                this.setLimite(novoLimite);
                System.out.println("Limite atualizado com sucesso para: R$" + this.getLimite());
    
            } else {
                System.out.println("Valor limite inválido");
            }
            
        }
    
        public void exibirHistorico(){
            if(historicoDeTransacoes.isEmpty()) {
                System.out.println("Nenhuma transação realizada");
    
            } else {
                System.out.println("Histórico de transaçoes");
                
                for(Transacao transacao : historicoDeTransacoes) {
                    System.out.println(transacao.exibirDetalhes());
                }
            }
        }
    
    }
