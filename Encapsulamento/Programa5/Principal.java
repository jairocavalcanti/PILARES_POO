package Encapsulamento.Programa5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ContaBancaria cb = new ContaBancaria();

      System.out.println(cb.numero_de_conta(scanner));


      scanner.close();
  }

}
