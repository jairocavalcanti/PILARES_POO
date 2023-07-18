package Encapsulamento.Programa1_instrutivo;

public class Principal {
    
    public static void main(String[] args) {        
        Conta c = new Conta();
        /*
        Apesar de parecer uma alteração de valor comum 
        o uso de getters e setters permite a implementação de alguma lógica a esses atributos
        como por exemplo uma cobrança de taxa adicional no valor assim como foi feito 
        no metodo 'getSaldo' da classe 'Conta'
        */
        
        c.depositar(200);
        //Subtraindo 5 do atributo saldo 
        c.sacar(5);
      
        c.setNome("jairo");
        c.setCpf("12345678");
      
        System.out.println("Nome: " + c.getNome());
        //Metodo 'getSaldo' impoe uma taxa de mais 5, somando assim 10 na subtraçao do valor final
        System.out.println("Saldo: " + c.getSaldo());
        System.out.println("CPF: " + c.getCpf());        
       

       

    }
}
