import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String nomeCliente = "", agencia = "";
        double saldo = 0;
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite o numero da agencia: ");
        numero = dados.nextInt();
        System.out.println("Digite a Agencia: ");
        agencia = dados.next();
        System.out.println("Digite seu nome: ");
        nomeCliente = dados.next();
        System.out.println("Valor do depósito: ");
        saldo = dados.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, ", nomeCliente);
        System.out.printf(" sua agência é %s, conta %d ",agencia, numero);
        System.out.printf("e seu saldo %2f ja está disponível para saque",saldo);
    }
}
