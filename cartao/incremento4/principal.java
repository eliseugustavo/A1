package card;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        cartaoCredito cartao = null;

        do { 
            System.out.println("Menu: ");
            System.out.println("1: consultar saldo ");   
            System.out.println("2: consultar limite ");
            System.out.println("3: realizar compra ");
            System.out.println("4: fazer novo cartão");
            System.out.println("5: informações do cartão ");
            System.out.println("6: Sair ");
            System.out.println("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (cartao != null) {
                        System.out.println("Saldo atual: R$" + cartao.getSaldo());
                    } else {
                        System.out.println();
                        System.out.println("Nenhum cartão encontrado.");
                        System.out.println("Por favor, crie um cartão na 4° opção.");
                        System.out.println();
                    }
                    break;

                case 2:
                    if (cartao != null) {
                        System.out.println("Limite disponível: R$" + cartao.getLimite());
                    } else {
                        System.out.println();
                        System.out.println("Nenhum cartão encontrado.");
                        System.out.println("Por favor, crie um cartão na 4° opção.");
                        System.out.println();
                    }
                    break;

                case 3:
                    if (cartao != null) {
                        System.out.println("Digite o valor da compra: ");  
                        double valorCompra = scanner.nextDouble();
                        // cartao.realizarTransacao(valorCompra); // Método não implementado na classe CartaoCredito
                        System.out.println("Compra realizada: R$" + valorCompra);
                    } else {
                        System.out.println();
                        System.out.println("Nenhum cartão encontrado.");
                        System.out.println("Por favor, crie um cartão na 4° opção.");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Criar Novo Cartão de Crédito");

                    // Coletar informações do cliente
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
              
                    // Criar o cliente
                    Cliente cliente = new Cliente(nome, cpf, cnpj, email, telefone);
              
                    // Coletar informações do cartão
                    System.out.print("Número do Cartão: ");
                    String numero = scanner.nextLine();
                 
                    // Criar o cartão de crédito
                    cartao = new cartaoCredito(numero, cliente, 5000, 2000);
              
                    // Exibir as informações do cartão
                    System.out.println("\nCartão Criado com Sucesso!");
                    System.out.println("Cliente: " + cartao.getCliente().getNome());
                    System.out.println("Número do Cartão: " + cartao.getNumero());
                    break;

                case 5:
                    if (cartao != null) {
                        System.out.println("Informações do cartão");
                        System.out.println("Número do cartão: " + cartao.getNumero());
                        System.out.println("Nome do titular: " + cartao.getCliente().getNome());
                        System.out.println("CPF: " + cartao.getCliente().getCpf());
                        /* observação: para pegar uma argumento a exemplo do getcpf, primeiro deve-se dizer ao programa 
                         * de qual classe (cartao), daí puxar o metodo "Cliente" com um "get"(getCliente) e daí puxar o "get" 
                         * desejado.
                        */
                        
                        
                    } else {
                        System.out.println();
                        System.out.println("Nenhum cartão encontrado.");
                        System.out.println("Por favor, crie um cartão na 4° opção.");
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }  
        } while (opcao != 6);
    
        scanner.close();
    }
}

