import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void X() {
        Cell cell = new Cell();
        assertEquals("0", cell.display());
    }

    @Test
    public void Z() {
        Cell cell = new Cell();
        assertEquals("0", cell.toString());
    }
    @Test
    public void Y() {
        Cell cell = new Cell();
        cell.link(new Cell());
        assertEquals("00", cell.display());
    }
}
