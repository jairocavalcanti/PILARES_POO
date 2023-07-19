package Encapsulamento.Programa3;

public class PainelTesla implements ComandosTesla {

     private boolean abrir_dianteiras;
     private boolean abrir_traseiras;
     private boolean ligar_radio;
     private boolean desligar_radio;
     private Integer volume = 0;
  


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


    public boolean getLigar_radio() {
        return ligar_radio;
    }

    public void setLigar_radio(boolean ligar_radio) {
        this.ligar_radio = ligar_radio;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

     public boolean getDesligar_radio() {
        return desligar_radio;
    }

    public void setDesligar_radio(boolean desligar_radio) {
        this.desligar_radio = desligar_radio;
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
           this.setAbrir_dianteiras(false);
        }else{
            System.out.println(" ! - Portas dianteiras ja fechadas");
        }
      
    }


    @Override
    public void fechar_portas_traseiras() {
        if(this.getAbrir_traseiras()){
             System.out.println(" @ - Fechando portas traseiras");
             this.setAbrir_traseiras(false);
        }else{
            System.out.println(" ! - Portas traseiras ja fechadas");
        }
   
    }

    @Override
    public void ligaradio() {
        if(this.getLigar_radio()){
            System.out.println("! - Radio ja ligado");
        }else{
            System.out.println("@ - Ligando radio");
            this.setLigar_radio(true);
        }
     }

    @Override
    public void aumentarvolume() {
        if(this.getLigar_radio()){
            this.setVolume(this.getVolume() + 1);
        }else{
            System.out.println("! - Impossivel aumentar o som, radio desligado");
        }
     
    }

    @Override
    public void diminuirvolume() {
        if(this.getLigar_radio()){
            this.setVolume(this.getVolume() - 1);
           }else{
            System.out.println("! - Impossivel diminuir o som, radio desligado");
        }
    }

    @Override
    public void desligarradio() {
        if(this.getLigar_radio()){
            System.out.println("@ - Desligando radio");
             this.setLigar_radio(false);
        }else{
            System.out.println("! - Radio ja desligado");
        }
       
    }

    @Override
    public void painel_de_midia() {
        System.out.println("////////////////////////");
        System.out.println("--- PAINEL DE MIDIA ---");
        System.out.printf("Volume: ");
        for(int i = 0; i<this.getVolume(); i++ ){
        System.out.printf("[" + i + "]");
       }
    }

}