import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da sua Conta:");
        int numero = scan.nextInt();

        System.out.println("Agora, digite o número da sua Agência:");
        String agencia = scan.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scan.next();

        System.out.println("Digite o saldo da sua conta:");
        float saldo = scan.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        scan.close();
    }
}
