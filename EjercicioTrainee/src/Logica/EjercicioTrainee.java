package Logica;

import java.text.DecimalFormat;

public class EjercicioTrainee {

    public static void main(String[] args) {

       
        DecimalFormat df = new DecimalFormat("#.00"); // creo un objeto para formatear el precio e importo la libreira
        
        // creo los objetos Auto y Motocicleta y les coloco los atributos
        Auto coche = new Auto(4, "Peugeot", "206", 200000);
        Auto coche2 = new Auto(5, "Peugeot", "208", 250000);
        Motocicleta moto = new Motocicleta(125, "Honda", "Titan", 60000);
        Motocicleta moto2 = new Motocicleta(160, "Yamaha", "YBR", 80500.50);
        
        
        // Muestro los datos ingresados d elos Autos y las Motocicletas
        System.out.println("Marca: " + coche.getMarca() + " // " + "Modelo: " + coche.getModelo() + " // " + "Puertas: " + coche.getPuertas() + " // " + "Precio: $" + df.format(coche.getPrecio()));

        System.out.println("Marca: " + moto.getMarca() + " // " + "Modelo: " + moto.getModelo() + " // " + "cilindrada: " + moto.getCilindrada() + "cc" + " // " + "Precio: $" + df.format(moto.getPrecio()));

        System.out.println("Marca: " + coche2.getMarca() + " // " + "Modelo: " + coche2.getModelo() + " // " + "Puertas: " + coche2.getPuertas() + " // " + "Precio: $" + df.format(coche2.getPrecio()));

        System.out.println("Marca: " + moto2.getMarca() + " // " + "Modelo: " + moto2.getModelo() + " // " + "cilindrada: " + moto2.getCilindrada() + "cc" + " // " + "Precio: $" + df.format(moto2.getPrecio()));

        System.out.println("=============================");
        

        // El Vehiculo mas caro
        if (coche.getPrecio() > coche2.getPrecio() && coche.getPrecio() > moto.getPrecio() && coche.getPrecio() > moto2.getPrecio()) {

            System.out.println("Vehiculo mas caro: " + coche.getMarca() + " " + coche.getModelo());

        } else if (coche2.getPrecio() > moto.getPrecio() && coche2.getPrecio() > moto2.getPrecio()) {

            System.out.println("Vehiculo mas caro: " + coche2.getMarca() + " " + coche2.getModelo());

        } else if (moto.getPrecio() > coche.getPrecio() && moto.getPrecio() > coche2.getPrecio() && moto.getPrecio() > moto2.getPrecio()) {

            System.out.println("Vehiculo mas caro: " + moto.getMarca() + " " + moto.getModelo());

        } else if (moto2.getPrecio() > coche.getPrecio() && moto2.getPrecio() > coche2.getPrecio() && moto2.getPrecio() > moto.getPrecio()) {

            System.out.println("Vehiculo mas caro: " + moto2.getMarca() + " " + moto2.getModelo());
        }

        // El Vehiculo mas Barato
        if (coche.getPrecio() < coche2.getPrecio() && coche.getPrecio() < moto.getPrecio() && coche.getPrecio() < moto2.getPrecio()) {

            System.out.println("Vehiculo mas Barato: " + coche.getMarca() + " " + coche.getModelo());

        } else if (coche2.getPrecio() < moto.getPrecio() && coche2.getPrecio() < moto2.getPrecio()) {

            System.out.println("Vehiculo mas Barato: " + coche2.getMarca() + " " + coche2.getModelo());

        } else if (moto.getPrecio() < coche.getPrecio() && moto.getPrecio() < coche2.getPrecio() && moto.getPrecio() < moto2.getPrecio()) {

            System.out.println("Vehiculo mas Barato: " + moto.getMarca() + " " + moto.getModelo());

        } else if (moto2.getPrecio() < coche.getPrecio() && moto2.getPrecio() < coche2.getPrecio() && moto2.getPrecio() < moto.getPrecio()) {

            System.out.println("Vehiculo mas Barato: " + moto2.getMarca() + " " + moto2.getModelo());
        }

        // Vehiculo que contiene en su Modelo la letra "Y"
        
        String palabra = moto2.getModelo();

        String letrabuscada = "y";

        char[] vector = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++) {

            String letra = String.valueOf(vector[i]);

            if (letrabuscada.equalsIgnoreCase(letra)) {

                System.out.println("Vehiculo que contiene en el modelo la letra 'Y' :  " + moto2.getMarca() + " " + moto2.getModelo() + " " + df.format(moto2.getPrecio()));

            }

        }

        System.out.println("=============================");

        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        // Vehiculos ordenados de mayor a menor
        double aux;
        double arreglo[] = new double[4];  // creo un arreglo de 4 posiciones ya que son los 2 autos y las 2 motos

        
        arreglo[0] = coche.getPrecio();   // les cargo a cada posicion dentro del vector el precio de cada vehiculo
        arreglo[1] = coche2.getPrecio();
        arreglo[2] = moto.getPrecio();
        arreglo[3] = moto2.getPrecio();
        

        // metodo de la burbuja para ordenar los vehiculos por precio
        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = i; j < arreglo.length; j++) {

                if (arreglo[i] < arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }

        }
        
        
       

        // imprimo lo que esta dentro del arreglo
        
        for (int i = 0; i < arreglo.length; i++) {
            
            
            if(arreglo[i] == coche.getPrecio()){
                
                System.out.println(coche.getMarca()+coche.getModelo());
            }if(arreglo[i] == coche2.getPrecio()){
                
                System.out.println(coche2.getMarca()+coche2.getModelo());
            }if(arreglo[i] == moto.getPrecio()){
                
                System.out.println(moto.getMarca()+moto.getModelo());
            }if(arreglo[i] == moto2.getPrecio()){
                
                System.out.println(moto2.getMarca()+moto2.getModelo());
            }

        }
        

    }

}
