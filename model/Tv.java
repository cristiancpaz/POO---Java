package model;

public class Tv {
  private final String fabricante;
  private final  String modelo;
  private final  String tamanho;
  private final  String resolucao;
  private  int volume;
  private  int canal;
  private  boolean ligado = false;
  private  boolean mudo = false;

    public Tv(String fab, String mod, String tam, String res){
        this.fabricante = fab;
        this.modelo = mod;
        this.tamanho = tam;
        this.resolucao = res;
    }
    public int canal(){
        return this.canal;
    }
    public int volume(){
        return this.volume;
    }

    public void ligar(){
        this.ligado = true;
        this.canal = 2;
        this.volume = 5;
        
    }

    public void desligar(){
        this.ligado = false;
        
    }

    public void aumentarVolume(){
        if(this.ligado){
            if(this.volume >=0 && this.volume <100){
                this.volume ++;
            }
        }else{
            this.volume = 0;
        }
       
    }

    public void baixarVolume(){
        if(this.ligado){
            if(this.volume > 0 && this.volume <= 100){
                this.volume--;
            }
        }else{
            this.volume = 0;
        }
        
    }

     public void subirCanal(){
         if(this.canal >= 2 && this.canal < 69){
             this.canal++;
         }
         
    }
    public void baixarCanal(){
        if(this.canal > 2 && this.canal <= 69){
            this.canal--;
        }
        
    }
    public void mutar(){
        if(this.mudo == false){
            if (this.volume > 0){
                this.volume = 0;
            }else{
                this.volume = 10;
            }
        }
        
    }
    public int irCanal(int canal){
        this.canal = canal;
        return canal;
    }
    public int retornarCanal(int canal){
        return canal;
    }
    public int getCanal() {
        return canal;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public String getResolucao() {
        return resolucao;
    }
    public String getTamanho() {
        return tamanho;
    }
    
    
}
