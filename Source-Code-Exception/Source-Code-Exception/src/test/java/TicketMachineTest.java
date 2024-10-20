/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import java.util.Iterator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vitor
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("inserir");
        int quantia = 0;
        TicketMachine instance = null;
        instance.inserir(quantia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class TicketMachine.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        TicketMachine instance = null;
        int expResult = 0;
        int result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTroco method, of class TicketMachine.
     */
    @Test
    public void testGetTroco() {
        System.out.println("getTroco");
        TicketMachine instance = null;
        Iterator<PapelMoeda> expResult = null;
        Iterator<PapelMoeda> result = instance.getTroco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class TicketMachine.
     */
    @Test
    public void testImprimir() throws Exception {
        System.out.println("imprimir");
        TicketMachine instance = null;
        String expResult = "";
        String result = instance.imprimir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
