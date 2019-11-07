import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinesweeperTest {

    @Test
    public void SameString(){
        assertEquals("", Minesweeper.Sweep("0 0"));
    }
    @Test
    public void FieldSize(){
        assertEquals("Field #1:\n0\n", Minesweeper.Sweep("1 1\n.\n0 0"));
    }
    @Test
    public void FieldSize1(){
        assertEquals("Field #1:\n00\n", Minesweeper.Sweep("1 2\n..\n0 0"));
    }

}
