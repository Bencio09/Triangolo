/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }

    /**
     * Test of classificaTriangolo method, of class Triangolo.
     */
    @Test
    public void testClassificaTriangolo() {
        double a = 4;
        double b = 3;
        double c = 5;
        System.out.println("classificaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Rettangolo";
        String result = instance.classificaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testClassificaTriangolo() {
        double a = 4;
        double b = 4;
        double c = 5;
        System.out.println("classificaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Isoscele";
        String result = instance.classificaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testClassificaTriangolo() {
        double a = 4;
        double b = 3;
        double c = 6;
        System.out.println("classificaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Scaleno";
        String result = instance.classificaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testClassificaTriangolo() {
        double a = 4;
        double b = 4;
        double c = 4;
        System.out.println("classificaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Equilatero";
        String result = instance.classificaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcolaPerimetro method, of class Triangolo.
     */
    @Test
    public void testCalcolaPerimetro() {
        double a = 10;
        double b = 15;
        double c = 12;
        System.out.println("calcolaPerimetro");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 37;
        double result = instance.calcolaPerimetro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcolaArea method, of class Triangolo.
     */
    @Test
    public void testCalcolaArea() {
        double a = 37;
        double b = 13;
        double c = 40;
        System.out.println("calcolaArea");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 240;
        double result = instance.calcolaArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
