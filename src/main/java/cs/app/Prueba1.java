package cs.app;

public class Prueba1 {
    double cantidadCombustible;
    double consumoCombustible;
    double capacidadTanque;

    Prueba1(double cantidadCombustible,double consumoCombustible,double capacidadTanque){
        this.cantidadCombustible = cantidadCombustible;
        this.consumoCombustible = consumoCombustible;
        this.capacidadTanque = capacidadTanque;
    }


    String rebastecer(double litros){
        double espacioLibre = this.capacidadTanque - this.cantidadCombustible;
        if (litros > espacioLibre){
            return "Vehiculo no se puede reabastecer el tanque, esta lleno.";
        }
        else{
            this.cantidadCombustible += (litros * 0.95);
            return "La cantidad de combustible del vehiculo es: "+cantidadCombustible;
        }

    }


    String manejar(double km) {
        double combustibleRequiere = km*this.consumoCombustible;
        if(cantidadCombustible-combustibleRequiere<0){
            return "Vehiculo necesita reabastecimiento de combustible.";
        }
        else{
            this.cantidadCombustible -=combustibleRequiere;
            return ("Vehiculo viajó " +(km)+" km y aún tiene " +String.format("%.2f",cantidadCombustible)+ " de combustible");
        }
    }

}
