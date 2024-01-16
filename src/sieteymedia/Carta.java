package sieteymedia;

/**
 * 
 * @param palo
 */
public class Carta {

    private String numero;
    private String palo;
    private double valor;

   
    public Carta(String palo, String numero, double puntuacion){
        this.valor = puntuacion;
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", this.numero, this.palo);
    }

    
}
