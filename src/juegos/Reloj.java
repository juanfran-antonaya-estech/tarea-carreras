package juegos;

public class Reloj {

    int horas;
    int minutos;
    int segundos;

    public Reloj(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Reloj(int horas, int minutos, int segundos){
        if(horas > 0 & horas < 23 ){
            this.horas = horas;
        }
        if(minutos > 0 & minutos < 59){
            this.minutos = minutos;
        }
        if(segundos > 0 & minutos < 59){
            this.segundos = segundos;
        }
    }

    @Override
    public String toString() {
        return horas + " : " + minutos + " : " + segundos;
    }

    




    
}
