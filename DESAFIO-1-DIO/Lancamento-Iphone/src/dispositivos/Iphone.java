package dispositivos;

import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorWeb;
import interfaces.ReprodutorMultimidia;

public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReprodutorMultimidia {
    public static void main(String[] args) {
        Iphone phone = new Iphone();
        Scanner ler = new Scanner(System.in);
        String comando = "";
        int fechaPrograma = 0;
        
        
        do {
            System.out.println("\nDigite qual aplicativo deseja abrir: ");
            System.out.println("1 - IPODE");
            System.out.println("2 - TELEFONE");
            System.out.println("3 - WEB");
            System.out.println("0 - PARA SAIR");
            comando = ler.next();
            comando = comando.toLowerCase();
        
            if(comando.equals("1")){
                musicPlayer(phone, comando, ler);
                
            }else if(comando.equals("2")){
                smartphone(phone, comando, ler);

            }else if(comando.equals("3")){
               NavegadorWeb(phone, comando, ler);

            }else{
                fechaPrograma = 1;
            }
        } while (fechaPrograma == 0);
        
        ler.close();
    }

    private static void musicPlayer(Iphone phone, String comando, Scanner ler){
        int voltarMenu = 0;
        while (voltarMenu == 0) {
            //Scanner ler = new Scanner(System.in);
            System.out.println("");
            System.out.println("Ipode aberto");
            System.out.println("Digite sua proxima opção: - listar, selecionar, tocar, pausa: ");
            System.out.println("1 - LISTAR");
            System.out.println("2 - SELECIONAR");
            System.out.println("3 - TOCAR");
            System.out.println("4 - PAUSAR");
            System.out.println("0 - MENU");
            comando = ler.next();
            comando = comando.toLowerCase();

            switch (comando) {
                case "1":
                    System.out.println("");
                    phone.listarMusicas();
                    break;
                case "2":
                    System.out.println("");
                    phone.selecionarMusica();
                    break;
                case "3":
                    System.out.println("");
                    phone.tocarMusica();
                break;
                case "4":
                    System.out.println("");
                    phone.pausarMusica();
                    break;
                default:
                    voltarMenu = 1;
                    break;
            }
        } 
    }

    private static void smartphone(Iphone phone, String comando, Scanner ler){
        int voltarMenu = 0;
        
        while (voltarMenu == 0) {

            System.out.println("\nTELEFONE ABERTO");
            System.out.println("Digite sua proxima opção: ");
            System.out.println("1 - LIGAR");
            System.out.println("2 - ATENDER");
            System.out.println("3 - CORREIO");
            System.out.println("4 - INICIAR CONFERENCIA");
            System.out.println("0 - MENU");
            comando = ler.next();
            comando = comando.toLowerCase();
            switch (comando) {
                case "1":
                    System.out.println("");
                    phone.ligar();
                    break;
                case "2":
                    System.out.println("");
                    phone.atender();
                    break;
                case "3":
                    System.out.println("");
                    phone.iniciarCorreioVoz();
                    break;
                case "4":
                    System.out.println("");
                    phone.conferencia();
                    break;
                default:
                    voltarMenu = 1;
                    break;
            }
        }
    }
    
    private static void NavegadorWeb(Iphone phone, String comando, Scanner ler){
        int voltarMenu = 0;

        while (voltarMenu == 0) {
            
            System.out.println("\nWEB ABERTA");
            System.out.println("Digite sua proxima opção: ");
            System.out.println("1 - ABRIR PAGINA");
            System.out.println("2 - NOVAABA");
            System.out.println("3 - ATUALIZAR");
            System.out.println("0 - MENU");
            comando = ler.next();
            comando = comando.toLowerCase();
            switch (comando) {
                case "1":
                    System.out.println("");
                    phone.exibirPagina();
                    break;
                case "2":
                    System.out.println("");
                    phone.adicionarNovaAba();
                    break;
                case "3":
                    System.out.println("");
                    phone.atualizarPagina();
                    break;
                default:
                    voltarMenu = 1;
                    break;
            }
        }
    }
    
    /* 
        NAVEGADOR WEB 
    */
    
    public void exibirPagina() {
        checarRedeWeb();
        System.out.println("Pagina exibida");
      }
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }
    public void atualizarPagina() {
        checarRedeWeb();
        enviarNovaRequisicao();
        coferirRespostaHTTP();
        System.out.println("Pagina atualizada");
    }
    private void checarRedeWeb(){
        System.out.println("Rede checada");
    }
    private void enviarNovaRequisicao(){
        System.out.println("Requisição enviada");
    }
    private void coferirRespostaHTTP(){
        System.out.println("resposta verificada");
    }

    /* FIM DO NAVEGADOR WEB */


     /*
        APARELHO TELEFONICO 
    */
    public void ligar(){
        checarNumero();
        checarGSM();
        System.out.println("Fazendo ligação");
    }
    public void atender(){
        System.out.println("Ligação atendida");
    }
    public void iniciarCorreioVoz(){
        checarNumero();
        checarGSM();
        System.out.println("Correio iniciado");
    }
    public void conferencia(){
        checarNumero();
        checarGSM();
        System.out.println("Coferencia iniciada");
    }


    private void checarGSM(){
        System.out.println("Rede checada");
    }
    private void checarNumero(){
        System.out.println("Numero checado");
    }

    /* 
     *
        FIM DO APARELHO TELEFONICO 
     *
    */

    /* 
     *
        REPRODUTOR DE MULTIMÍDIA 
     *
    */
    public void tocarMusica() {
        System.out.println("Tocando musica");
     }
    public void pausarMusica() {
        System.out.println("Musica em pausa");
     }
    
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }
    
    public void listarMusicas() {
        System.out.println("Musicas listadas");
    }



    /* 
     *
        FIM DO REPRODUTOR DE MÚSICA 
     *
    */

   


    

   
}
