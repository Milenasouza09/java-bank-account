import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {


        // Inicializando os dados do cliente
        String nome = "Milena Souza";
        String tipoConta = "Corrente";
        double saldo = 1599.99;


        // Concatenação
        System.out.println("*******************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************");

        // Menu de Opções
        int escolha = 0;

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);


        // Implementando os cálculos
        while (escolha != 4) {
            System.out.println(menu);
            escolha = leitura.nextInt();


            if (escolha == 1) {
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (escolha == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não é possível realizar a transferência! Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Seu saldo atual é: " + saldo);
                }
            } else if (escolha == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atual é : " + saldo);

            } else if (escolha != 4) {
                System.out.println("Opção inválida");

            }
        }
    }
}





