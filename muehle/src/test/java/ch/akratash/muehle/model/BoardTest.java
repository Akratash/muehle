package ch.akratash.muehle.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BoardTest 
{

    @Test
    public void makeMovePhase1LegalExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(0, 0, 0);

        assertTrue(result);

    }

    @Test
    public void makeMovePhase1Illegal1ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(3, 0, 0);

        assertFalse(result);
    }
}
