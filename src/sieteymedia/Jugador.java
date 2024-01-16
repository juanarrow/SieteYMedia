package sieteymedia;

public class Jugador {
    private Mazo mazo; 
    private String nombre;
    private double fondos;

    Mano mano;

    public Jugador(String nombre, double fondos, Mazo mazo){
        this.mazo = mazo;
        this.fondos = fondos;
        this.nombre = nombre;
        this.mano = new Mano();
    }

    public double getFondos() {
        return fondos;
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirCarta(){
        mano.anadeCarta(mazo.extraerCarta());
    }
}
