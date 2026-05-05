import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        int numero_conta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nome_cliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}