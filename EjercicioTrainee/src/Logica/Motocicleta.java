
package Logica;


public class Motocicleta extends Vehiculo{
    
    
    private int cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(int cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    

    
    
    
    
}
