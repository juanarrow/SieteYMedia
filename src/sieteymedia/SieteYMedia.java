package sieteymedia;

public class SieteYMedia {
    Jugador jugador;
    Jugador ordenador;
    Mazo mazo;


    public SieteYMedia(String nombreJugador, double fondos){
        inicializa(nombreJugador, fondos);
    }

    public void inicializa(String nombreJugador, double fondos){
        mazo = new Mazo();
        jugador = new Jugador(nombreJugador, fondos,  mazo);
        ordenador = new Jugador("Ordenador", 0, mazo);
    }




    
}
