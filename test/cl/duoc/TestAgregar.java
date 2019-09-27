package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
    
     @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Empleado empleado = new Empleado("194997485", "felipe", 22,5);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
        
    }
}
