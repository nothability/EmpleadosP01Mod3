package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestBuscar {

    public TestBuscar() {
    }

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "22222222";
        BussEmpleado instance = new BussEmpleado();
        String rutEsperado = rut;
        String result = instance.Buscar(rut).getRut();
        assertEquals(rutEsperado, result);
    }
}
