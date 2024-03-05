package sieteymedia;

public class Mano implements ManoInterface{
    private Carta[] cartas;
    private int numCartas;

    public Mano(){
        numCartas = 0;
        cartas = new Carta[10];
    }
    
    public void anadeCarta(Carta carta){
        cartas[numCartas]=carta;
        numCartas++;
    }

    public Carta[] getCartas(){
        Carta[] ret = new Carta[numCartas];
        int posicion = 0;
        for(int i=0;i<numCartas; i++){
            if(cartas[i]!=null){
                ret[posicion]=cartas[i];
                posicion++;
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        String ret = "";
        for(Carta carta:getCartas()){
            ret+=carta+", ";
        }
        return ret;
        
    }
}
