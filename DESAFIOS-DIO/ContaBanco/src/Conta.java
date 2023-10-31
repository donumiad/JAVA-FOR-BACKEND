import java.util.Scanner;

public abstract class Conta implements Iconta{
    Scanner dadoScanner = new Scanner(System.in);

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Cliente clienteConta;
    

    
    
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
        this.clienteConta = cliente;
    }

    @Override
    public void sacar() {
        double valor = 0;
        if(this.saldo > 0){
            System.out.printf("Seu saldo é:", this.saldo);
            System.out.println("Digite o valor a ser sacado: ");
            valor = dadoScanner.nextDouble();
            this.saldo -= valor;
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
        
     }
    @Override
    public void depositar() {
        double valor = 0;
        System.out.println("Digite o valor a depositar: ");
        valor = dadoScanner.nextDouble();
        this.saldo += valor;
      }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        //this.sacar(Scanner dadoScanner);
        contaDestino.depositar();
     }

    public int getAgencia() {
        return agencia;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfoComuns(){
        System.out.println(String.format("\nTitular: %s", this.clienteConta.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da conta: %d", this.numeroDaConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        
    }
    protected void analiseDeCredito(){

    }
  
}
