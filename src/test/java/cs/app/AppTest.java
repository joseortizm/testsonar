package cs.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import static cs.app.App.*;

public class AppTest {
    @Test
    public void test01(){
        Prueba1 nissan = new Prueba1(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan.Rebastecer(500)); //Vehiculo no se puede reabastecer el tanque, esta lleno.
        Assert.assertEquals(nissan.rebastecer(500),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }

    @Test
    public void test02(){
        Prueba1 toyota = new Prueba1(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota.manejar(4)); //Vehiculo viajó 4.0 km y aún tiene 6.40 de combustible
        Assert.assertEquals(toyota.manejar(4),"Vehiculo viajó 4.0 km y aún tiene 6.40 de combustible");
    }
}
