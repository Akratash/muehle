package ch.akratash.muehle.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BoardTest 
{

    @Test
    public void makeMovePhase1LegalExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(2, 0, 0);

        assertTrue(result);

    }

    @Test
    public void makeMovePhase1Illegal1ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(0, 3, -1);

        assertFalse(result);
    }

    @Test
    public void makeMovePhase1Illegal2ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(3, 0, 0);

        assertFalse(result);
    }

    @Test
    public void makeMovePhase1Illegal3ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(1, -1, 1);

        assertFalse(result);
    }

    @Test
    public void makeMovePhase1Illegal4ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(0, 3, 0);

        assertFalse(result);
    }

    @Test
    public void makeMovePhase1Illegal5ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(0, 1, 1);

        assertFalse(result);
    }

    @Test
    public void makeMovePhase1Illegal6ExpectTrue()
    {
        Board b = new Board();
        boolean result = b.makeMovePhase1(1, 1, 1);

        assertFalse(result);
    }

    @Test
    public void makeMovePhase1IllegalDoubleSetIndexExpectTrue()
    {
        Board b = new Board();
        b.makeMovePhase1(0, 0, 0);

        assertFalse(b.makeMovePhase1(0, 0, 0));
    }


    @Test
    public void switchPlayerWorksExpectTrue()
    {
        Board b = new Board();
        b.makeMovePhase1(0, 0, 0);

        assertEquals(Player.BLACK, b.getActivePlayer());
    }
}
