package Cartão;

import java.util.Scanner;

public class Cartao {

    private String numero;
    private String nomeTitular;
    private String cpfTitular;
    private float limite;
    private float saldo;

    public Cartao(String numero, String nomeTitular, String cpfTitular, float limiteInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.limite = limiteInicial;
        this.saldo = 0.0f; // Saldo inicial como 0
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

    public float consultarLimite() {
        return limite;
    }

    public float consultartotalSaldo() {
        return saldo;
    }

    public void realizarTransacao(float valor) {
        if (valor <= getLimite()) {
            this.setLimite(this.getLimite() - valor);
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não possui saldo suficiente.");
        }
    }

    public Cartao criarCartao() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número do cartão: ");
        String numero = entrada.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = entrada.nextLine();

        System.out.print("Digite o CPF do titular: ");
        String cpfTitular = entrada.nextLine();

        System.out.print("Digite o limite inicial: ");
        float limiteInicial = entrada.nextFloat();

        return new Cartao (numero, nomeTitular, cpfTitular, limiteInicial);
    }
}



