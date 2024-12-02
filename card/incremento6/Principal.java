package aitvidade;

public class Principal {
    public static void main(String[] args) {
        // Criando Cartões de Diferentes Tipos
        CartaoBasico cartaoBasico = new CartaoBasico("1111-2222-3333-4444", "João", "123.456.789-10", 2000.00f);
        cartaoPremium cartaoPremium = new cartaoPremium("5555-6666-7777-8888", "Maria", "987.654.321-00", 3000.00f, 1500.00f, 5.0f);
        cartaoEmpresa cartaoEmpresarial = new cartaoEmpresa("9999-0000-1111-2222", "Empresa XYZ", "456.789.012-34", 10000.00f, 12);

        // Realizando Transações em cada tipo de cartão
        System.out.println("Cartão Básico:");
        cartaoBasico.realizarTransacao(1500.00);
        cartaoBasico.exibirInfo();

        System.out.println("\nCartão Premium:");
        cartaoPremium.realizarTransacao(3500.00);
        cartaoPremium.exibirInfo();

        System.out.println("\nCartão Empresarial:");
        cartaoEmpresarial.realizarTransacao(7000.00);
        cartaoEmpresarial.exibirInfo();
    }
}
