import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite a sua agência (xxx-x): ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome e sobrenome: ");
        String nome_sobrenome = scanner.next();

        System.out.println("Digite o valor disponível: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Olá" + nome_sobrenome + ", obrigado por criar uma conta em nosso banco, sua Agência é "
                + agencia + ", Conta " + conta + " e seu Saldo " + saldo + " já está disponível para saque.");

    }
}