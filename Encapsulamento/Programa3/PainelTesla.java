package Encapsulamento.Programa3;

public class PainelTesla implements ComandosTesla {

     private boolean abrir_dianteiras;
     private boolean abrir_traseiras;
     private boolean fechar_dianteiras;
     private boolean fechar_traseiras;
     
  
    public boolean getAbrir_dianteiras() {
        return abrir_dianteiras;
    }

    public void setAbrir_dianteiras(boolean abrir_dianteiras) {
        this.abrir_dianteiras = abrir_dianteiras;
    }

    public boolean getAbrir_traseiras() {
        return abrir_traseiras;
    }

    public void setAbrir_traseiras(boolean abrir_traseiras) {
        this.abrir_traseiras = abrir_traseiras;
    }

    public boolean getFechar_dianteiras() {
        return fechar_dianteiras;
    }

    public void setFechar_dianteiras(boolean fechar_dianteiras) {
        this.fechar_dianteiras = fechar_dianteiras;
    }

    public boolean getFechar_traseiras() {
        return fechar_traseiras;
    }

    public void setFechar_traseiras(boolean fechar_traseiras) {
        this.fechar_traseiras = fechar_traseiras;
    }

    
    @Override
    public void abrir_portas_dianteiras() {
       if(this.getAbrir_dianteiras()){  
         System.out.println(" ! - Portas dianteiras ja abertas");
        }else{
             System.out.println(" @ - Abrindo portas dianteiras");
             this.setAbrir_dianteiras(true);
       }
     
    }


    @Override
    public void abrir_portas_traseiras() {
        if(this.getAbrir_traseiras()){
            System.out.println(" ! - Portas traseiras ja abertas");
        }else{
            System.out.println(" @ - Abrindo portas traseiras");
            this.setAbrir_traseiras(true);
        }
    
    }


    @Override
    public void fechar_portas_dianteiras() {
        if(this.getAbrir_dianteiras()){
           System.out.println(" @ - Fechando portas dianteiras");
           this.setFechar_dianteiras(true);
           this.setAbrir_dianteiras(false);
        }else{
            System.out.println(" ! - Portas dianteiras ja fechadas");
        }
      
    }


    @Override
    public void fechar_portas_traseiras() {
        if(this.getAbrir_traseiras()){
             System.out.println(" @ - Fechando portas traseiras");
             this.setFechar_traseiras(true);
             this.setAbrir_traseiras(false);
        }else{
            System.out.println(" ! - Portas traseiras ja fechadas");
        }
   
    }

  
}