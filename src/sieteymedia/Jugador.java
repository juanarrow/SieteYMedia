package sieteymedia;

public class Jugador implements JugadorInterface{
    private String nombre;
    private double fondos;

    private Mano mano;

    public Jugador(String nombre, double fondos){
        this.fondos = fondos;
        this.nombre = nombre;
        this.mano = new Mano();
    }

    @Override
    public double getFondos() {
        return fondos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Mano getMano(){
        return mano;
    }
    
    @Override
    public void recibirCarta(Carta carta){
        mano.anadeCarta(carta);
    }

    @Override
    public void incrementarFondos(double cantidad){
        this.fondos+=cantidad;
    }

    @Override
    public void decrementarFondos(double cantidad){
        this.fondos-=cantidad;
    }

    @Override
    public String toString() {
        String ret="";
        ret+=String.format("Jugador: %s%nFondos: %.2f€%nCartas: %s", nombre, fondos, getMano());
        return ret;
    }
}
