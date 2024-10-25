package cartaoDeCredito1;

public class cartaoCredito {

    String numero;
    String nomeTitular;
    String cpfTitular;
    float limite;
    float saldo;

    public float consultarLimite(){
        return limite;

    }

    public float consultartotalSaldo() {
        return saldo;

    }

    public void realizarTransacao(float valor) {
        if (valor <= this.limite){
            this.limite -= valor;
            this.saldo += valor;

        } else {
            System.out.println("Você não possui saldo suficiente");
        }
    }

}
