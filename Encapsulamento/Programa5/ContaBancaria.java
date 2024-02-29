package Encapsulamento.Programa5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {

    private Integer numero_da_conta  = 0;
    private Double saldo = 0.0;
    private String nome = "";
    private String tipo_de_conta;
   
    
    public ContaBancaria() {

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
        
        while(numero_da_conta < 100){
        System.out.printf("Insira o numero da conta: ");
        int novo_numero_conta = scanner.nextInt();

        if(novo_numero_conta >= 100){
           setNumero_da_conta(novo_numero_conta);
           System.out.printf("Numero de conta inserido - #");
           break;
        }else{
           System.out.println("Numero de conta inserido possui menos de 3 algarismos! ");
          }
        }
        
        return getNumero_da_conta();
    
    }

    public String verificar_saldo(){
       
        if(saldo > 0){

        DecimalFormat df = new DecimalFormat("R$ ##.###");
        System.out.printf("Saldo disponivel da conta - #" + getNumero_da_conta() + " - ");
       
        String saldo_formatado =  df.format(saldo);

        return saldo_formatado;
        }else{
        return "Saldo indisponivel ! ";
       
        }
    }
    
    public String inserir_nome(Scanner scanner){
        
        while (nome.length() < 5) {
        System.out.printf("Insira o nome do titular da conta: ");
        String nome = scanner.next();
      
        if(nome.length() >= 5){
           System.out.println("Nome de titular inserido com sucesso ! \n");
           setNome(nome);
           break;
        }else{
            System.out.println("!! Nome inserido tem menos de 5 caracteres !!");
        }
    }
        System.out.printf("Titular da conta de numero #" + getNumero_da_conta() + "-" + " ");
        return getNome();
    }

    public void sacar_valor(Double valor){
        if(saldo > valor){
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " realizado !");   
        }else{
            System.out.println("Saldo insuficiente para saque! ");
        }         
    }

    public void depositar_valor(Double valor){
        saldo += valor;
        System.out.println("Depósito na quantia de R$: " + valor + " realizado !");
    }

     @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("R$ ##.###");

        sb.append("------------------------------------- \n");

        sb.append("-- INFORMAÇÕES GERAIS -- \n");

        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Numero da conta: ").append(numero_da_conta).append("\n");
        sb.append("Tipo de conta: ").append(tipo_de_conta).append("\n");
        sb.append("Saldo: ").append(df.format(saldo));
       
        sb.append(" \n------------------------------------- \n");
        
        return sb.toString();
    }

}
