import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Pede para o cliente se identificar
            System.out.println("Identifique-se: ");
            String nomeCliente = scanner.nextLine();

            // Pede o numero da agencia do cliente
            System.out.println("Por favor, digite o número da sua Agencia: ");
            int agencia = scanner.nextInt();

            // Numero da conta da agencia
            String conta = "067-8";

            // Saldo da conta bancaria do cliente
            double saldo = 247.48;

            System.out.printf("Ola, %s! Obrigado por criar uma conta em nosso Banco, sua agencia é %d, conta %s e seu saldo R$%s já está disponível para saque.%n", nomeCliente, agencia, conta, saldo);
    }   }
}
