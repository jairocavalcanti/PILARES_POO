package Encapsulamento.Programa5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ContaBancaria cb = new ContaBancaria();

      System.out.println("Insira a opção de conta que deseja criar: PF/PJ");
      String opcao = scanner.next();

      if(opcao.toLowerCase().equals("pf")){

        cb.setTipo_de_conta("PF");

        System.out.println(cb.numero_de_conta(scanner));
        System.out.println("--");
        System.out.println(cb.inserir_nome(scanner));
       
        String init = "m";

        while (init.equals("m")) {
          
          System.out.println("Insira a operação que deseja realizar: ");
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

            default:
            System.out.println("!! Insira uma oção válida !!");
            break;
          }

        }

      }
     
      
      scanner.close();
  }

}
