package Herança.Programa3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Selecione o tipo de conta: 1 - Conta Corrente // 2 - Poupança");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("CONTA CORRENTE SELECIONADA");    

                System.out.println("Insira o nome do cliente: ");
                String nome = scanner.next();

                System.out.println("Insira o numero da conta do cliente: ");
                int num_conta = scanner.nextInt();
                double saldo = 1000;
             
                ContaBancaria cb = new ContaBancaria(nome, num_conta,saldo);

                System.out.println(cb.toString());

                System.out.println("Deseja sacar valor da conta ?");
                String escolha2 = scanner.next();
              
                if(escolha2.equals("sim")){
                System.out.println("Insira o valor a ser sacado: ");
                int saque = scanner.nextInt();
                  
                System.out.println("Saldo apos saque: " + (saldo = cb.sacar(saque,saldo)));
                }
               
                System.out.println("Deseja depositar valor na conta ?");
                  String escolha3 = scanner.next();
                   if(escolha3.equals("sim")){
                     System.out.println("Insira o valor a ser depositado: ");
                       int deposito = scanner.nextInt();
  
                       System.out.println("Saldo apos deposito: " + (cb.depositar(deposito,saldo)));
   
                }else{
                    System.out.println("Programa finalizado...");
                }

                break;
            
            case 2:
                 double saldo2 = 1200;
                 int meses = 5;

                System.out.println("CONTA POUPANCA SELECIONADA");

                System.out.println("Insira o nome do cliente: ");
                nome = scanner.next();

                System.out.println("Insira o numero da conta do cliente: ");
                num_conta = scanner.nextInt();

                ContaPoupança cp = new ContaPoupança(nome, num_conta,saldo2, meses);
                
                System.out.println(cp.toString());
                
                System.out.println("Valor com rendimento de conta poupança somado: " + cp.calcularnovosaldo(saldo2,meses));
                
                break;

            case 3:
                String id = "jae";
                double saldo3 = 200000;

                System.out.println("CONTA ESPECIAL SELECIONADA");

                System.out.println("Insira o nome do cliente: ");
                nome = scanner.next();

                System.out.println("Insira o numero da conta do cliente: ");
                num_conta = scanner.nextInt();
               
                ContaEspecial ce = new ContaEspecial(nome, num_conta,saldo3, id);

                System.out.println(ce.toString());

                System.out.println("Deseja sacar valor da conta ?");
                String escolha4 = scanner.next();
              
               if(escolha4.equals("sim")){
                System.out.println("Insira o valor a ser sacado: ");
                int saque = scanner.nextInt();
              
                System.out.println("Insira o id do usuario para prosseguir: ");
                String verificacao = scanner.next();
                 
                System.out.println("Saldo apos saque: " + (ce.sacar2(saque,saldo3,id,verificacao)));
                }

                default:
                System.out.println("!! INSIRA UMA OPÇAO VALIDA !!");
        
        
        scanner.close();

       }
    
    }
}