
package Logica;


public class Auto extends Vehiculo{
    
    
    private int puertas;

    public Auto() {
    }

    public Auto(int puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    

    
    
    
    
    
    
    
}
