package aitvidade;

import java.util.Scanner;

public abstract class cartaoCredito {
    

    private String numero;
    private String nomeTitular;
    private String cpfTitular;
    private float limite;
    private float saldo;

    public cartaoCredito(String numero, String nomeTitular, String cpfTitular, float limiteInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.limite = limiteInicial;
        this.saldo = 0.0f; 
    }

    public String getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public double consultarLimite() {
        return limite;
    }

    public double consultartotalSaldo() {
        return saldo;
    }

    public void realizarTransacao(double valor) {
        if (valor <= getLimite()) {
            this.limite -= valor;
            this.saldo += valor;
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não possui saldo suficiente.");
        }
    }

    public static cartaoCredito criarCartao() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número do cartão: ");
        String numero = entrada.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = entrada.nextLine();

        System.out.print("Digite o CPF do titular: ");
        String cpfTitular = entrada.nextLine();

        System.out.print("Digite o limite inicial: ");
        float limiteInicial = entrada.nextFloat();


        entrada.close();
        return new CartaoBasico (numero, nomeTitular, cpfTitular, limiteInicial);
    }

        public void exibirInfo() {
            System.out.println("Número do Cartão: " + numero);
            System.out.println("Nome do Titular: " + nomeTitular);
            System.out.println("Limite do Cartão: R$ " + limite);
            System.out.println("Saldo devedor: R$ " + saldo);
    }
}

