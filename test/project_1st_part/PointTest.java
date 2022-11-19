/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package project_1st_part;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author crist
 */
public class PointTest {
    
    public PointTest() {
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
     * Test of getX_coordinate method, of class Point.
     */
    @Test
    public void testGetX_coordinate() {
        System.out.println("getX_coordinate");
        Point instance = null;
        int expResult = 0;
        int result = instance.getX_coordinate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY_coordinate method, of class Point.
     */
    @Test
    public void testGetY_coordinate() {
        System.out.println("getY_coordinate");
        Point instance = null;
        int expResult = 0;
        int result = instance.getY_coordinate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bruteForce method, of class Point.
     */
    @Test
    public void testBruteForce() {
        System.out.println("bruteForce");
        List<Point> points = null;
        double expResult = 0.0;
        double result = Point.bruteForce(points);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        Point point1 = null;
        Point point2 = null;
        double expResult = 0.0;
        double result = Point.distance(point1, point2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closestPair method, of class Point.
     */
    @Test
    public void testClosestUtil() {
        System.out.println("closestUtil");
        List<Point> points = null;
        int startIndex = 0;
        int endIndex = 0;
        double expResult = 0.0;
        double result = Point.closestPair(points, startIndex, endIndex);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stripClosest method, of class Point.
     */
    @Test
    public void testStripClosest() {
        System.out.println("stripClosest");
        List<Point> strip = null;
        int size = 0;
        double d = 0.0;
        double expResult = 0.0;
        double result = Point.stripClosest(strip, size, d);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
