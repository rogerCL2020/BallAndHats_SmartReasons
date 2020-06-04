package test;


import pruebas.BallAndHats;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class BallAndHatsTest {

    public BallAndHats problem;

    @Before
    public void setUp() {
    	problem = new BallAndHats();
    }

    @Test(timeout = 2000)
    public void testPrueba0() {

	String hats = ".o.";
        int numSwaps = 1;

        int rspt = 0;
        int prueba = problem.getHat(hats, numSwaps);

        Assert.assertEquals(rspt, prueba);
    }

    @Test(timeout = 2000)
    public void testPrueba1() {

        String hats = "..o";
        int numSwaps = 0;

        int rspt = 2;
        int prueba = problem.getHat(hats, numSwaps);

        Assert.assertEquals(rspt, prueba);
    }

    @Test(timeout = 2000)
    public void testPrueba2() {

        String hats = "o..";
        int numSwaps = 1;

        int rspt = 1;
        int prueba = problem.getHat(hats, numSwaps);

        Assert.assertEquals(rspt, prueba);
    }

    @Test(timeout = 2000)
    public void testPrueba3() {

        String hats = "..o";
        int numSwaps = 2;

        int rspt = 0;
        int prueba = problem.getHat(hats, numSwaps);

        Assert.assertEquals(rspt, prueba);
    }

    @Test(timeout = 2000)
    public void testPrueba4() {

        String hats = "o..";
        int numSwaps = 101;

        int rspt = 1;
        int prueba = problem.getHat(hats, numSwaps);

        Assert.assertEquals(rspt, prueba);
    }

}
