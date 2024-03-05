package sieteymedia;

public class Baraja implements BarajaInterface{
   
    private Carta[] cartas;
    private int numCartas;

    public Baraja(){
        nuevaBaraja();
    }

    @Override
    public Carta extraerCarta(){
        Carta carta = null;
        numCartas--;
        carta = cartas[numCartas];
        cartas[numCartas] = null;
        return carta;
    }

    @Override
    public void nuevaBaraja(){
        cartas = new Carta[40];
        numCartas = 40;
        int i = 0;
        while(i < cartas.length){
            int indice = (int)(Math.random()*cartas.length);
            boolean libre = true;
            for(int j=0; j<i && libre; j++){
                if(indice==cartas[j].getCodigo())
                    libre = false;
            }
            if(libre){
                cartas[i] = new Carta(indice);
                i++;
            }
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for(Carta carta:cartas){
            if(carta!=null){
                ret += carta+", ";
            }
        }
        return ret;
    }

}
