package Encapsulamento.Programa5;

import java.util.Scanner;

public class Pessoa_juridica extends ContaBancaria {

    private String mome_da_empresa;
    private Long CNPJ;


    public Pessoa_juridica(){

    }    

    public Pessoa_juridica(String mome_da_empresa, Long CNPJ) {
        this.mome_da_empresa = mome_da_empresa;
        this.CNPJ = CNPJ;
    }

    public Pessoa_juridica(Integer numero_da_conta, Double saldo, String nome, String tipo_de_conta,
    String mome_da_empresa, Long CNPJ) {
        super(numero_da_conta, saldo, nome, tipo_de_conta);
        this.mome_da_empresa = mome_da_empresa;
        this.CNPJ = CNPJ;
    }


    public String getMome_da_empresa() {
        return mome_da_empresa;
    }

    public void setMome_da_empresa(String mome_da_empresa) {
        this.mome_da_empresa = mome_da_empresa;
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
            break;
        }else{
            System.out.println("Erro!");
        }
    }
      return cnpj ;
    }


    @Override
    public String toString() {
        return super.toString();
    }
    
}
