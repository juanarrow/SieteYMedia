package sieteymedia;

public class Mazo {

    public static String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
    public static String[] numeros = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
    private Carta[] cartas;
    int numCartas;

    public Mazo(){
        cartas = new Carta[40];
        numCartas = 40;
        inicializaMazo();
    }

    private double puntuacionCarta(int hash){
        return hash%10+1<=7?hash%10+1:0.5;
    }

    private void inicializaMazo(){
        int contador = 0;
        while(contador < cartas.length){
            int index = (int)(Math.random()*cartas.length);
            String palo = palos[((int)(Math.random()*4))];
            boolean libre = true;
            for(int i=0; i<contador && libre; i++){
                if(cartas[i].getNumero().equals(numeros[index%10]) && cartas[i].getPalo().equals(palo))
                    libre = false;
            }
            if(libre){
                cartas[contador] = new Carta(palo, numeros[index%10], puntuacionCarta(index));
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
