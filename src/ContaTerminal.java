import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        ContaBanco contaBanco = new ContaBanco();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        contaBanco.numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a Agência:");
        contaBanco.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo:");
        contaBanco.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        contaBanco.saldo = scanner.nextDouble();

        System.out.println("Olá " + contaBanco.nomeCliente + " obrigado por criar uma conta em nosso banco, " +
                            "sua agência é "
                            + contaBanco.agencia+ "," + " conta " + contaBanco.numeroConta + " e seu saldo é:"
                            + contaBanco.saldo + " já está disponível para saque :)");




    }
}
