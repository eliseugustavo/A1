package aitvidade;

    public class CartaoBasico extends cartaoCredito {

        public CartaoBasico(String numero, String nomeTitular, String cpfTitular, float limiteInicial) {
            super(numero, nomeTitular, cpfTitular, limiteInicial);
        }
    
        @Override
        public void realizarTransacao(double valor) {
            if (valor <= getLimite()) {
                setLimite(getLimite() - (float) valor); // Deduz o valor do limite
                setSaldo(getSaldo() + (float) valor);   // Adiciona o valor ao saldo devedor
                System.out.println("Compra de R$ " + valor + " realizada no Cartão Básico.");
            } else {
                System.out.println("Saldo insuficiente no Cartão Básico.");
            }
        }
    }
