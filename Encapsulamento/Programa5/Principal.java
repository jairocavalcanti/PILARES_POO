package Encapsulamento.Programa5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ContaBancaria cb = new ContaBancaria();
      Pessoa_juridica pj = new Pessoa_juridica();
      boolean init_0 = false;

      while(init_0 != true){
      System.out.println("Insira a opção de conta que deseja criar: PF/PJ");
      String opcao = scanner.next();
      
      if(opcao.toLowerCase().equals("pf")){

        cb.setTipo_de_conta("PF");

        System.out.println(cb.numero_de_conta(scanner));
        System.out.println("--");
        System.out.println(cb.inserir_nome(scanner));
       
        String init = "a";

        while (init.equals("a")) {
          
          System.out.println("Insira a operação que deseja realizar: " + 
          " 1 - Depósito //" + 
          " 2 - Saque //" +
          " 3 - Verificar saldo //" +
          " 4 - Informações gerais //" +
          " 5 - Encerrar");
          int escolha = scanner.nextInt();

          switch (escolha) {
           
            case 1:
            System.out.println("Insira a quantidade que deseja depositar: ");
            Double deposito = scanner.nextDouble();
            cb.depositar_valor(deposito);
            break;
          
            case 2:
            System.out.println("Insira a quantidade que deseja sacar: ");
            Double saque = scanner.nextDouble();
            cb.sacar_valor(saque);
            break;

            case 3: 
            System.out.println(cb.verificar_saldo());
            break;

            case 4:
            System.out.println(cb.toString());
            break;

            case 5:
            System.out.println("--");
            System.out.println("Sistema Encerrado !");
            System.out.println("--");
            init = "f";
            break;

            default:
            System.out.println("!! Insira uma opção para PF válida !!");
            break;
          }

        }

      }else{
       
       pj.setTipo_de_conta("PJ");

       System.out.println(pj.inserir_nome_da_empresa(scanner));
       System.out.println("--");
       System.out.println(pj.inserir_CNPJ(scanner));
       System.out.println("--");
       System.out.println(pj.numero_de_conta(scanner));
       System.out.println("--");
       System.out.println(pj.inserir_nome(scanner));

       String init_2 = "b";

       while (init_2.equals("b")) {

        System.out.println("Insira a operação que deseja realizar: " + 
        " 1 - Depósito //" + 
        " 2 - Saque //" +
        " 3 - Verificar saldo //" +
        " 4 - Informações gerais //" +
        " 5 - Encerrar");
        int escolha = scanner.nextInt();

        switch (escolha) {
         
          case 1:
          System.out.println("Insira a quantidade que deseja depositar: ");
          Double deposito = scanner.nextDouble();
          pj.depositar_valor(deposito);
          break;

          case 2:
          System.out.println("Insira a quantidade que deseja sacar: ");
          Double saque = scanner.nextDouble();
          pj.sacar_valor(saque);
          break;

          case 3: 
          System.out.println(pj.verificar_saldo());
          break;

          case 4:
          System.out.println(pj.toString());
          break;

          case 5:
          System.out.println("--");
          System.out.println("Sistema Encerrado !");
          System.out.println("--");
          init_2 = "f";
          break;

          default:
          System.out.println("!! Insira uma opção para PJ válida !!");
          break;
        }
        
      }
      
    }
    
  }
    scanner.close();
  }

}
