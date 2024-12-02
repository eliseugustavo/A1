package aitvidade;

public class cartaoEmpresa extends cartaoCredito {
    
    private int maxParcelasSemJuros;

    public cartaoEmpresa(String numero, String nomeTitular, String cpfTitular, float limiteInicial, int maxParcelasSemJuros) {
        super(numero, nomeTitular, cpfTitular, limiteInicial);
        this.maxParcelasSemJuros = maxParcelasSemJuros;
    }

    @Override
    public void realizarTransacao(double valor) {
        if (valor <= getLimite()) {  
            setLimite(getLimite() -(float) valor);  
            setSaldo(getSaldo() +(float) valor);    
            System.out.println("Compra de R$ " + valor + " realizada no Cartão Empresarial.");
            System.out.println("Parcelamento disponível em até " + maxParcelasSemJuros + " vezes sem juros.");
        } else {
            System.out.println("Você não possui saldo suficiente para essa transação no Cartão Empresarial.");
        }
    }

    // Exibir informações do Cartão Empresarial

    public int getMaxParcelasSemJuros() {
        return maxParcelasSemJuros;
    }

    public void setMaxParcelasSemJuros(int maxParcelasSemJuros) {
        this.maxParcelasSemJuros = maxParcelasSemJuros;
    }
}

