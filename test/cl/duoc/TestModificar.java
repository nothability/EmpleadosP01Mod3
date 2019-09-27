package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado empleado = new Empleado("77777777", "Thomas", 28, 5);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(empleado);
        boolean esperado = true;
        empleado = new Empleado("77777777", "Tom", 28, 5);
        boolean obtenido = instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);
    }

}
