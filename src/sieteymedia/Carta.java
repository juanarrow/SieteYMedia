package sieteymedia;

public class Carta implements CartaInterface{

    private int codigo;
   
    public Carta(int codigo){
        this.codigo = codigo; 
    }

    @Override
    public String getPalo() {
        return BarajaInterface.getPalo(codigo);
    }

    @Override
    public String getNumero() {
        return BarajaInterface.getNumero(codigo);
    }

    @Override
    public int getCodigo(){
        return codigo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", getNumero(), getPalo());
    }

    
}
