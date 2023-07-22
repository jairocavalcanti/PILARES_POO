package Herança.Programa3;

public class ContaPoupança extends ContaBancaria {

    int meses;

    public ContaPoupança(String cliente, int num_conta, double saldo , int meses) {
        super(cliente, num_conta, saldo);
        this.meses = meses;
    }
    
    
    public double calcularnovosaldo(double saldo, int meses){
        return saldo + (meses * (saldo*0.005));
    }
}
