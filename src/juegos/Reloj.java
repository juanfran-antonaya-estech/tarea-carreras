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
        String htexto = menosQueNueve(horas);
        String mtexto = menosQueNueve(minutos);
        String stexto = menosQueNueve(segundos);

        return htexto + " : " + mtexto + " : " + stexto;
    }

    private String menosQueNueve(int n) {
        if (n < 10) {
            return "0" + n;
        } else { return "" + n; }
    }
    public boolean modificarHora(int horas, int minutos, int segundos){
        if(horas < 0 & horas > 23 ){
            return false;
        }
        if(minutos < 0 & minutos > 59){
            return  false;
        }
        if(segundos < 0 & minutos > 59){
            return  false;
        }
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

        return true;
    }

    public void sumarSegundo(){
        this.segundos ++;
    }

    public void sumarSegundos(int cant){
        this.segundos += cant;
    }





    
}
