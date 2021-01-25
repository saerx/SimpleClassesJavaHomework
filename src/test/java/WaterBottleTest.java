import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void volumeStarts100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkFunctionReducesBy10(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void emptyDrainsVolume(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test

    public void fillReturnsTo100(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
