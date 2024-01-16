package sieteymedia;

public class Mazo {

    public static String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
    private Carta[] cartas;
    int numCartas;
    public Mazo(){
        cartas = new Carta[40];
        numCartas = 40;
        inicializaMazo();
    }

    private void inicializaMazo(){
        int contador = 0;
        while(contador < cartas.length){
            int index = (int)(Math.random()*cartas.length);
            String palo = palos[((int)Math.random()*4)];
            boolean libre = true;
            for(int i=0; i<contador && libre; i++){
                if(cartas[i].getNumero()==index%10 && cartas[i].getPalo().equals(palo))
                    libre = false;
            }
            if(libre){
                cartas[contador] = new Carta(palo, index);
                contador++;
            }
        }
    }

    public Carta extraerCarta(){
        Carta carta = null;
        numCartas--;
        carta = cartas[numCartas];
        cartas[numCartas] = null;
        return carta;
    }
}
