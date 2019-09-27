
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
   
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String rut="11111111";
        Empleado empleado=new Empleado("11111111","felipe", 22,5);
        BussEmpleado instance=new BussEmpleado();
        instance.Crear(empleado);
        boolean esperado=true;  
        boolean obtenido=instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
}
