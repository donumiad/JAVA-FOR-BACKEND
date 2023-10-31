import java.util.Scanner;

public interface Iconta {
    void sacar();
    void depositar();
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
