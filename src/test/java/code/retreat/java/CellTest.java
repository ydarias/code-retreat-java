package code.retreat.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {


    @Test
    public void a_new_cell_is_in_dead_state() throws Exception {
        var cell = new Cell();

        assertTrue(cell.isDead());
    }
    
}