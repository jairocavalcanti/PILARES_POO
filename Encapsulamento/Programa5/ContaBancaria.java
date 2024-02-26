package Encapsulamento.Programa5;

import java.util.Scanner;

public class ContaBancaria {

    private Integer numero_da_conta;
    private Double saldo;
    private String nome;
    private String tipo_de_conta;
   

    public ContaBancaria(){

    }

    public ContaBancaria(Integer numero_da_conta, Double saldo, String nome, String tipo_de_conta) {
        this.numero_da_conta = numero_da_conta;
        this.saldo = saldo;
        this.nome = nome;
        this.tipo_de_conta = tipo_de_conta;
    }


    public Integer getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(Integer numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_de_conta() {
        return tipo_de_conta;
    }

    public void setTipo_de_conta(String tipo_de_conta) {
        this.tipo_de_conta = tipo_de_conta;
    }


    public Integer numero_de_conta(Scanner scanner){
        System.out.println("Insira o numero da conta: ");
        int novo_numero_conta = scanner.nextInt();

        setNumero_da_conta(novo_numero_conta);
        
        System.out.printf("Numero de conta inserido - #");

        return getNumero_da_conta();
    }

    
    
}
