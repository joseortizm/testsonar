package cs.app;

import java.util.logging.Logger;

public class App {
    static final Logger logger = Logger.getLogger(App.class.getName());
    static double combustibleConsumoVehiculo = 0.9;
    static double combustibleConsumoCamion = 1.6;
    static double tanqueCapacidad = 100;

    public static void main(String[] args){
        logger.info("Bienvenido a la App");

        double cantidadCombustible = 20;

        double valorkmToyota = 5;
        double litrosToyota = 25;

        double valorkmVolvo = 4;
        double litrosVolvo = 25;

        Prueba1 toyota = new Prueba1(cantidadCombustible,combustibleConsumoVehiculo,tanqueCapacidad);
        String res1mane = toyota.manejar(valorkmToyota);
        String res1reba = toyota.rebastecer(litrosToyota);
        logger.info(res1mane);
        logger.info(res1reba);


        Prueba1 volvo = new Prueba1(cantidadCombustible,combustibleConsumoCamion,tanqueCapacidad);
        String res2mane = volvo.manejar(valorkmVolvo);
        String res2reba = toyota.rebastecer(litrosVolvo );
        logger.info(res2mane);
        logger.info(res2reba);
    }


}
