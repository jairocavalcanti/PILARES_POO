package Encapsulamento.Programa5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ContaBancaria cb = new ContaBancaria();

      System.out.println(cb.numero_de_conta(scanner));
      System.out.println("--");
      System.out.println(cb.inserir_nome(scanner));
      System.out.println("--");
      System.out.println(cb.verificar_saldo());

      scanner.close();
  }

}
