package Encapsulamento.Programa5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {

    private Integer numero_da_conta;
    private static Double saldo = 10000.00;
    private String nome;
    private String tipo_de_conta;
   

    public ContaBancaria(){

    }

    public ContaBancaria(Integer numero_da_conta, String nome, String tipo_de_conta) {
        this.numero_da_conta = numero_da_conta;
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
        System.out.printf("Insira o numero da conta: ");
        int novo_numero_conta = scanner.nextInt();

        setNumero_da_conta(novo_numero_conta);
        
        System.out.printf("Numero de conta inserido - #");
        
        return getNumero_da_conta();
    
    }

    public String verificar_saldo(){
        DecimalFormat df = new DecimalFormat("R$ ##.###");
        System.out.printf("Saldo disponivel da conta - #" + getNumero_da_conta() + " - ");
       
        String saldo_formatado =  df.format(saldo);

        return saldo_formatado;
    }
    
    public String inserir_nome(Scanner scanner){
        System.out.printf("Insira o nome do titular da conta: ");
        String nome = scanner.next();
      
        setNome(nome);
 
        System.out.printf("Titular da conta de numero #" + getNumero_da_conta() + "-" + " ");
        return getNome();
     }

     public void sacar_valor(Double valor){
         saldo =- valor;
         System.out.println("Saque de " + valor + " realizado !");          
     }

     @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();


        return sb.toString();
     }


}
