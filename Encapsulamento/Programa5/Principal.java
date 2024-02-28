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
       
        String init = "m";

        while (init.equals("m")) {
          
          System.out.println("Insira a operação que deseja realizar: " + 
          " 1 - Depósito //" + 
          " 2 - Saque //" +
          " 3 - Verificar saldo //" +
          " 4 - Informações gerais ");
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
            System.out.println("!! Insira uma oção válida !!");
            break;
          }

        }

      }else{
       
       pj.setTipo_de_conta("PJ");

       System.out.println(pj.numero_de_conta(scanner));
       System.out.println("--");
       System.out.println(pj.inserir_nome(scanner));

      }
    
    }
      
      scanner.close();
  }

}
