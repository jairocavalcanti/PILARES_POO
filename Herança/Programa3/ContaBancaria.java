package Herança.Programa3;

public class ContaBancaria {
   
    private String cliente;
    private int num_conta;
    private double saldo;
   
    public ContaBancaria(String cliente, int num_conta, double saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public double sacar(double saque, double saldo){
        if(saldo > saque){
          return saldo - saque;
        }else{
            return 0.0;
        }
       
    }
    
    public double depositar(double deposito, double saldo){
        return saldo + deposito;
    }

    @Override
    public String toString() {
        return "Dados da conta: [ cliente = " + cliente + ", num_conta = " + num_conta + ", saldo = " + saldo + " ]";
    }




    

    



}
