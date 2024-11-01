package Cartão;
import java.util.Scanner;

public class loginn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        // Instancia um novo cartão de crédito com valores iniciais
        Cartao cartao = new Cartao("223", "Eliseu", "123.456.789-10", 1000);

        while (continuar) {
            System.out.println("    Menu de opções: ");
            System.out.println();
            System.out.println("1 - Consultar limite");
            System.out.println("2 - Consultar fatura");
            System.out.println("3 - Realizar compra");
            System.out.println("4 - Criar novo cartão");
            System.out.println("5 - Consultar informações");
            System.out.println("6 - Sair");
            System.out.println();

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Limite disponível: " + cartao.consultarLimite());
                    break;
                case 2:
                    System.out.println("Saldo atual da fatura: " + cartao.consultartotalSaldo());
                    break;
                case 3:
                    System.out.println("Digite o valor da compra: ");
                    float valor = sc.nextFloat();
                    cartao.realizarTransacao(valor);
                    break;
                case 4:
                    // Criar um novo cartão e atribuir à variável cartao
                    cartao = cartao.criarCartao();
                    break;
                case 5:
                    // Exibir as informações do cartão atual
                    System.out.println("Informações do cartão:");
                    System.out.println("Número: " + cartao.getNumero());
                    System.out.println("Titular: " + cartao.getNomeTitular());
                    System.out.println("CPF do Titular: " + cartao.getCpfTitular());
                    System.out.println("Limite: " + cartao.getLimite());
                    System.out.println("Saldo: " + cartao.getSaldo());
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Saindo do Menu");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}
