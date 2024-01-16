package sieteymedia;

/**
 * 
 * @param palo
 */
public class Carta {

    private int numero;
    private String palo;
    private double valor;

    private static String numeroToString(int numero){
        switch(numero){
            case 1:
                return "Uno";
            case 2:
                return "Dos";   
            case 3:
                return "Tres";
            case 4:
                return "Cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "Seis";
            case 7:
                return "Siete";
            case 8:
                return "Sota";
            case 9:
                return "Caballo";
            case 10:
                return "Rey";
            default:
                return "Ninguno";
        }
    }
    public Carta(String palo, int numero){
        this.valor = (numero<=7)?numero:0.5;
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", numeroToString(numero), this.palo);
    }

    
}
