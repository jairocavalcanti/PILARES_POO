package Encapsulamento.Programa5;

import java.util.Scanner;

public class Pessoa_juridica extends ContaBancaria {

    private String nome_da_empresa;
    private Long CNPJ = 0L;


    public Pessoa_juridica(){

    }    

    public Pessoa_juridica(String mome_da_empresa, Long CNPJ) {
        this.nome_da_empresa = mome_da_empresa;
        this.CNPJ = CNPJ;
    }

    public Pessoa_juridica(Integer numero_da_conta, Double saldo, String nome, String tipo_de_conta,
    String mome_da_empresa, Long CNPJ) {
        super(numero_da_conta, saldo, nome, tipo_de_conta);
        this.nome_da_empresa = mome_da_empresa;
        this.CNPJ = CNPJ;
    }


    public String getNome_da_empresa() {
        return nome_da_empresa;
    }

    public void setNome_da_empresa(String mome_da_empresa) {
        this.nome_da_empresa = mome_da_empresa;
    }

    public Long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Long CNPJ) {
        this.CNPJ = CNPJ;
    }
    

    @Override
    public Integer numero_de_conta(Scanner scanner){
        return super.numero_de_conta(scanner);
    }
    
    @Override
    public String verificar_saldo(){
        return super.verificar_saldo();
    }
    
    @Override
    public String inserir_nome(Scanner scanner){
        System.out.println("-- PESSOA JURIDICA --");
        return super.inserir_nome(scanner);
    }

    @Override
    public void sacar_valor(Double valor){
        super.sacar_valor(valor);
    }

    @Override
    public void depositar_valor(Double valor){
        super.depositar_valor(valor);
    }

    public String inserir_CNPJ(Scanner scanner){
       String cnpj = Long.toString(CNPJ);
        
       while (true) {
        System.out.println("Insira o CNPJ da empresa (14 dígitos): ");
        cnpj = scanner.next();

        if(cnpj.length() >= 14){
            long cnpjlong = Long.parseLong(cnpj);
            System.out.println("CNPJ inserido com sucesso! ");
            setCNPJ(cnpjlong);
            break;
        }else{
            System.out.println("--");
            System.out.println("Erro! - CNPJ inserido possui menos de 14 digitos! ");
            System.out.println("--");
        }
    }
      return "CNPJ de número :" + cnpj;
    }

    public String inserir_nome_da_empresa(Scanner scanner){

        while (true) {
         System.out.println("Insira o nome da empresa da PJ: ");
         String nome_da_empresa = scanner.next(); 
         
         if(nome_da_empresa.length() >= 5){
            System.out.println("-- Nome da empresa inserido com sucesso! -- ");
            setNome_da_empresa(nome_da_empresa);
            break;
          }else{
            System.out.println("--");
            System.out.println("Erro! - Nome de empresa inserido possui menos de 5 digitos! ");
            System.out.println("--");
        }     
    }
      return "Nome da empresa :" + nome_da_empresa;
    }

    @Override
    public String toString() {
        System.out.println("-------------------------------------------");
        System.out.println("Numero do CNPJ do usuario - " + getNome() + " : " + "[" + getCNPJ() + "]");
        System.out.println("Nome da empresa - " + getNome_da_empresa());
        return super.toString();
    }
    
}

