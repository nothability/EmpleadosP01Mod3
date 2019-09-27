
package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testMontoBono {

    public testMontoBono() {
    }
  
     @Test
    public void testMontoBono() {
        System.out.println("MontoBono");
        Empleado instance = new Empleado();
        int result = instance.montoBono(4);
        int expResult = 200000;
        assertEquals(expResult, result);
    }
    
}
