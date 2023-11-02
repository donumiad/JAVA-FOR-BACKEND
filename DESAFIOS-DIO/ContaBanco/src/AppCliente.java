import java.util.Scanner;


public class AppCliente {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int tipoDeConta;
        String tempNome;
        long tempCpf;
        String tempEndereco;
        String temTelefonePrincipal;
        String tempSenha;
        int sair = 0, acaoDesejada = 0;
        Conta poupanca = new ContaPoupanca(null);
        Conta corrente = new ContaCorrente(null);

        System.out.println("PAGINA INICIAL DO APP");
        System.out.println("Ola, bem vindo ao nosso banco.");
        System.out.println("Qual conta deseja abrir? ");
        System.out.println("1 - poupanca; 2 - Corrente: ");
        tipoDeConta = dados.nextInt();

        if(tipoDeConta == 1){
            System.out.println("Digite seu nome: ");
            tempNome = dados.next();
            System.out.println("Digite seu CPF: ");
            tempCpf = dados.nextLong();
            System.out.println("Digite seu Endereco: ");
            tempEndereco = dados.next();
            System.out.println("Digite seu Telefone: ");
            temTelefonePrincipal = dados.next();
            System.out.println("Digite sua Senha: ");
            tempSenha = dados.next();

            
            Cliente cliente = new Cliente(tempNome, tempCpf, tempEndereco, temTelefonePrincipal, tempSenha);
            poupanca = new ContaPoupanca(cliente);

            System.out.println("\nCONTA POUPANCA CRIADA COM SUCESSO");

        }else if(tipoDeConta == 2){
            System.out.println("Digite seu nome: ");
            tempNome = dados.next();
            System.out.println("Digite seu CPF: ");
            tempCpf = dados.nextLong();
            System.out.println("Digite seu Endereco: ");
            tempEndereco = dados.next();
            System.out.println("Digite seu Telefone: ");
            temTelefonePrincipal = dados.next();
            System.out.println("Digite sua Senha: ");
            tempSenha = dados.next();

            Cliente cliente = new Cliente(tempNome, tempCpf, tempEndereco, temTelefonePrincipal, tempSenha);
            corrente = new ContaCorrente(cliente);

            System.out.println("\nCONTA CORRENTE CRIADA COM SUCESSO");
        }

        while (sair == 0) {

            System.out.println("Digite a operação desejada");
            System.out.println("1 - Sacar \n 2 - Depositar \n 3 - Tranferir \n 4 - Extrato \n 5 - Sair");
            acaoDesejada = dados.nextInt();
            if(acaoDesejada == 1){   //SACAR
                if(tipoDeConta == 1){  //POUPANCA
                    poupanca.sacar();
                }else{                  //CORRENTE
                    corrente.sacar();
                }
            }else if(acaoDesejada == 2){ //DEPOSITAR
                if(tipoDeConta == 1){  //POUPANCA
                    poupanca.depositar();
                }else{                  //CORRENTE
                    corrente.depositar();
                }
                
            }else if(acaoDesejada == 3){  //TRANSFERIR
                if(tipoDeConta == 1){  //POUPANCA
                    poupanca.transferir();
                }else{                  //CORRENTE
                    corrente.depositar();
                }

            }else if(acaoDesejada == 4){

            }else{
                System.out.println("\nAção não reconhecida\n");
            }
        }
                
        
        /*Cliente raimundo = new Cliente();
        raimundo.setNome("Raimundo");

        Conta cc = new ContaCorrente(raimundo);
        Conta poupanca = new ContaPoupanca(raimundo);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();*/
        
        dados.close();
    }

}


//APP CLIENTE
//CRIAR CONTA
//DEPOSITAR
//SACAR
//PEDIR EMPRETIMO
//DELETAR CONTA
