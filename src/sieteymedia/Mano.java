package sieteymedia;

public class Mano {
    Carta[] cartas;
    int numCartas;

    public Mano(){
        numCartas = 0;
        cartas = new Carta[40];
    }
    public void anadeCarta(Carta carta){
        cartas[numCartas]=carta;
        numCartas++;
    }

    public double puntuacion(){
        double ret = 0.0;
        for(Carta carta:cartas)
            ret +=carta.getValor();
        return ret;
    }

    public boolean esSieteYMedia(){
        return puntuacion()==7.5;
    }
    
}
