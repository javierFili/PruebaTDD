/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAURICIO
 */
public class TDDTest {
    
    public TDDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TDD.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TDD.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void pruebaInformacion() {
        System.out.println("main");
        String[] args = null;
        TDD.main(args);
        Desarrollador d1 = new Desarrollador("Juan Perez", "Desarrollador de Interfaces");
        Desarrollador d2 = new Desarrollador("Adrian Delgado", "Modelador de Bases de Datos");
        Pareja p1 = new Pareja(d1,d2,5);
        Reporte r1 = new Reporte();
        r1.registrar(p1);
        
        Pareja p2;
        p2 = r1.devolver(5); //Devuelve por numero pareja
        Desarrollador d3 = p2.sacarPrim();
        Desarrollador d4 = p2.sacarSeg();
        assertEquals("Juan Perez", d3.nombre);
        assertEquals("Desarrollador de Interfaces", d3.cargo);
        assertEquals("Adrian Delgado", d4.nombre);
        assertEquals("Modelador de Bases de Datos", d4.cargo);
    }
}
