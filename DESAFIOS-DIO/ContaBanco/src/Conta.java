import java.util.Scanner;

public abstract class Conta implements Iconta{
    Scanner dadoScanner = new Scanner(System.in);

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Cliente clienteConta;
    private double valorManipulado = 0;
    private boolean temSaldo = false;

    
    
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
        this.clienteConta = cliente;
    }

    @Override
    public void sacar() {
        verificaSaldo();
        if(temSaldo){
            this.saldo -= valorManipulado;
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
     }
    @Override
    public void depositar() {
        
        System.out.println("Digite o valor a depositar: ");
        valorManipulado = dadoScanner.nextDouble();
        this.saldo += valorManipulado;
      }
    @Override
    public void transferir() {
        verificaSaldo();
        if(temSaldo){
            this.saldo -= valorManipulado;
            System.out.println("CONTA DESTINO");
            
        }
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
    protected void verificaSaldo(){
        if (this.saldo > 0) {
            System.out.printf("Seu saldo é:", this.saldo);
            System.out.println("Digite o valor: ");
            valorManipulado = dadoScanner.nextDouble();
            if(valorManipulado <= this.saldo){
                temSaldo = true;
                return;
            }else{
                temSaldo = false;
                System.out.println("SALDO INSUFICIENTE");
                return;
            }
        }else{
            temSaldo = false;
            System.out.println("SALDO INSUFICIENTE");
            return;
        }
    }
  
}
