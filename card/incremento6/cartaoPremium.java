package aitvidade;

public class cartaoPremium extends CartaoBasico {

    private float limiteExtra;
    private float cashbackPercentual;

    public cartaoPremium(String numero, String nomeTitular, String cpfTitular, float limiteInicial, float limiteExtra, float cashbackPercentual) {
        super(numero, nomeTitular, cpfTitular, limiteInicial);
        this.limiteExtra = limiteExtra;
        this.cashbackPercentual = cashbackPercentual;
    }

    @Override
    public void realizarTransacao(double valor) {
        float limiteTotal = getLimite() + limiteExtra; // Limite total é o limite inicial + limite extra
        if (valor <= limiteTotal) {
            setLimite(getLimite() - (float) valor); // Deduz o valor do limite básico
            setSaldo(getSaldo() + (float) valor);   // Adiciona o valor ao saldo devedor

            // Calculando o cashback
            float cashback = (float) (valor * cashbackPercentual / 100);
            System.out.println("Compra de R$ " + valor + " realizada no Cartão Premium.");
            System.out.println("Cashback de R$ " + cashback + " creditado.");
        } else {
            System.out.println("Você não tem saldo suficiente, nem considerando o limite extra.");
        }
    }
}
