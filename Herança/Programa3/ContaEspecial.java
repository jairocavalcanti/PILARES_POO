package Herança.Programa3;

public class ContaEspecial extends ContaBancaria {

    String id;

    public ContaEspecial(String cliente, int num_conta, double saldo, String id) {
        super(cliente, num_conta, saldo);
        this.id = id;
        
    }
   

    public double sacar2(double saque, double saldo,String id, String verificacao){
           if(verificacao.equals(id)){
               return saldo - saque;
           }else{
              return 0.0;
           }
      
         }
    
    
    }

