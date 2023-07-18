package Encapsulamento.Programa1_instrutivo;

public class Conta {
    
    /*
    Atributos tipo private com o intuito de manter a consistencia dos mesmos,
    Evitar alterações que possam deixar o sistema inconsistente como por exemplo: 
    aumentar o valor de um dos atributos.
    Agora esses elementos somente poderao ser alterados somente dentro da propria classe
    */ 

    private String nome;
    private String cpf;
    private Double saldo;

    
    //Podemos evitar essa inconsistencia controlando o acesso a alguns dados através do encapsulamento
    

    public Conta(){
        saldo = 0.0;
    }

    public Conta(String nome, String cpf) {
       //'this()' 'chama' a logica do construtor que nao tem argumentos, caso 'public Conta(){}'
        this();
        this.nome = nome;
        this.cpf = cpf;
        
    }

    //Metodo get nos retorna o valor do atributo da classe
    public Double getSaldo(){
        System.out.println("Taxa no valor de 5,00R$");
         //Logica implementada ao atributo
         return saldo - 5;
    
    }

    //Metodo set nao retorna nada, ira apenas alterar o valor do atributo do objeto
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodo de deposito que faz a operação de adição ao valor
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    //Mesma logica do metodo de deposito, porem subtraindo valor, caso o valor seja menor que o saldo
    public void sacar(double valor){
        if(saldo > valor){
            saldo = saldo - valor;
        }
    }

    //GETTERS E SETTERS DE 'nome' e 'cpf' SEGUEM A MESMA LOGICA DOS ANTERIORES, POREM TRABALHAM COM UM TIPO DIFERENTE DE DADO

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 }
