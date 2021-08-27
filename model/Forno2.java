package model;

public class Forno2 {
    public final int volume;
    public final int tensao;
    public final int potencia;
    public final int largura;
    public final int altura;
    public final int profundidade;
    private boolean ligado = false;
    private int temperatura;
    private int minutos;
    private int tempoRestante;
    //private final int tick = 1;

    public Forno2(int volume, int tensao, int potencia, int largura, int altura, int profundidade){
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura =altura;
        this.profundidade = profundidade;
    }

    public int getAltura(){
        return altura;
    }
    public int getLargura(){
        return largura;
    }
    public int getPotencia(){
        return potencia;
    }
    public int getProfundidade(){
        return profundidade;
    }
    public int getTensao(){
        return tensao;
    }
    public int getVolume(){
        return volume;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public int temperatura() {
        if(this.ligado == false){
            this.temperatura = 0;
        }
        return this.temperatura;
    }

    public boolean ligado() {
        if(this.ligado == false){
            this.temperatura = 0;
        }
        return this.ligado;
    }
    
    public void aumentarTemperatura() {
        
        if(this.ligado == false){
            this.ligado = true;
            this.temperatura = 50;
        }else{
            if(this.temperatura == 50){
                this.temperatura += 50;
            }else
            if(this.temperatura == 100){
                this.temperatura += 50;
            }else 
            if(this.temperatura == 150){
                this.temperatura += 50;
            }else
            if(this.temperatura == 200){
                this.temperatura += 20;
            }else
            if(this.temperatura == 220){
                this.temperatura += 30;
            }else
            if( this.temperatura == 250){
                this.temperatura += 50;
            }else
            if( this.temperatura < 300){
                this.temperatura += 50;
            }
        }
        
    }

    public void diminuirTemperatura() {
        if(this.ligado){
            if(this.temperatura > 0){
                this.temperatura = temperatura-50;
            }
        }
    }

    public void desligar() {
        this.ligado = false;
        this.temperatura = 0;
    }

    public void setTimer(int i) {
        if(minutos >= 0 && minutos < 120){
            this.minutos += i;
        }
    }

    public int tempoRestante() {
       this.tempoRestante = this.minutos;
        return this.tempoRestante;
    }

    public int tick(){
       //int tempoR = this.tempoRestante();
       if(this.minutos > 0){
           this.minutos--;
       }
        if(this.minutos == 0){
            this.temperatura = 0;
            this.ligado = false;
        }
        return this.minutos;
    }
    
        
}
