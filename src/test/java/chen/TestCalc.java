package chen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestCalc {
    @Test
    public void calcTest() {
        Calc c = new Calc();
        assertEquals(2, c.add(1, 1));
        assertEquals(0, c.subtract(1, 1));
    }
}