/*Crie uma classe chamada CartaoDeCredito:
Atributos: numero (string), nomeTitular (string), cpfTitular(string), limite (float), saldo (float)
Adicione métodos para: consultarSaldo, consultarLimite, realizarTransação
Crie a classe Principal que recebe os dados e faz a instancia o CartaoDeCredito
Crie um menu para as opções:
Realizar Transação
Consultar Limite
Consultar Saldo */
package card.incremento2;
import java.util.Scanner;

public class principal {

    

 public static void main(String[] args){
    cartaoCredito cartao = new cartaoCredito("230", "eliseu", "123456789", 2000);

    Scanner entrada = new Scanner(System.in);
    int opçao;

    do { 
     System.out.println("Menu: ");
     System.out.println("1: consultar saldo ");   
     System.out.println("2: consultar limite ");
     System.out.println("3: realizar compra ");
     System.out.println("4: informações do cartão");
     System.out.println("5: sair ");
     System.out.println("Digite a opção desejada ");

     opçao = entrada.nextInt();

     switch (opçao) {
        case 1:
        System.out.println("saldo atual: R$" + cartao.getSaldo());
            
            break;
            
                case 2:
                System.out.println("limite disponível: R$" + cartao.getLimite());
                    break;

            case 3:
            System.out.println("digite o valor da compra: ");  
               double valorCompra = entrada.nextDouble();
               cartao.realizarTransação(valorCompra);
               break;
               case 4:
                System.out.println("informações do cartão");
                 System.out.println("numero do cartão: " + cartao.numeroCartao);
                 System.out.println("Nome do titular: " + cartao.nomeTitular);
                System.out.println("cpf: " + cartao.cpfTitular) ;
            case 5:
            System.out.println("Saindo...");
             break;
                default:
                System.out.println("Opção inválida.");
            
     }  
    } while (opçao != 5);
    entrada.close();
 }
}  

